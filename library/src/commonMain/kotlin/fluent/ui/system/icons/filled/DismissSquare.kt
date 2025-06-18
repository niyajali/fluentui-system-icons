package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.DismissSquare: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DismissSquare",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(8.22f, 8.22f)
            curveTo(8.513f, 7.927f, 8.987f, 7.927f, 9.28f, 8.22f)
            lineTo(12f, 10.939f)
            lineTo(14.72f, 8.22f)
            curveTo(15.013f, 7.927f, 15.487f, 7.927f, 15.78f, 8.22f)
            curveTo(16.073f, 8.513f, 16.073f, 8.987f, 15.78f, 9.28f)
            lineTo(13.061f, 12f)
            lineTo(15.78f, 14.72f)
            curveTo(16.073f, 15.013f, 16.073f, 15.487f, 15.78f, 15.78f)
            curveTo(15.487f, 16.073f, 15.013f, 16.073f, 14.72f, 15.78f)
            lineTo(12f, 13.061f)
            lineTo(9.28f, 15.78f)
            curveTo(8.987f, 16.073f, 8.513f, 16.073f, 8.22f, 15.78f)
            curveTo(7.927f, 15.487f, 7.927f, 15.013f, 8.22f, 14.72f)
            lineTo(10.939f, 12f)
            lineTo(8.22f, 9.28f)
            curveTo(7.927f, 8.987f, 7.927f, 8.513f, 8.22f, 8.22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DismissSquarePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DismissSquare, contentDescription = null)
    }
}
