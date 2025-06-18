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

public val FluentUi.Filled.SelectAllOn: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SelectAllOn",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(15.75f)
            curveTo(17.545f, 3f, 19f, 4.455f, 19f, 6.25f)
            verticalLineTo(15.75f)
            curveTo(19f, 17.545f, 17.545f, 19f, 15.75f, 19f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 19f, 3f, 17.545f, 3f, 15.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(15.28f, 9.03f)
            curveTo(15.573f, 8.737f, 15.573f, 8.263f, 15.28f, 7.97f)
            curveTo(14.987f, 7.677f, 14.513f, 7.677f, 14.22f, 7.97f)
            lineTo(10f, 12.189f)
            lineTo(8.03f, 10.22f)
            curveTo(7.737f, 9.927f, 7.263f, 9.927f, 6.97f, 10.22f)
            curveTo(6.677f, 10.513f, 6.677f, 10.987f, 6.97f, 11.28f)
            lineTo(9.47f, 13.78f)
            curveTo(9.763f, 14.073f, 10.237f, 14.073f, 10.53f, 13.78f)
            lineTo(15.28f, 9.03f)
            close()
            moveTo(6.5f, 19.999f)
            curveTo(7.078f, 20.902f, 8.09f, 21.5f, 9.241f, 21.5f)
            horizontalLineTo(16.246f)
            curveTo(19.148f, 21.5f, 21.5f, 19.148f, 21.5f, 16.246f)
            verticalLineTo(9.241f)
            curveTo(21.5f, 8.09f, 20.902f, 7.078f, 19.999f, 6.5f)
            verticalLineTo(16.246f)
            curveTo(19.999f, 18.319f, 18.319f, 19.999f, 16.246f, 19.999f)
            horizontalLineTo(9.241f)
            lineTo(9.216f, 19.999f)
            horizontalLineTo(6.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SelectAllOnPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.SelectAllOn, contentDescription = null)
    }
}
