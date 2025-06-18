package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.ArrowMaximizeVertical: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowMaximizeVertical",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.72f, 5.78f)
            curveTo(14.013f, 6.073f, 14.487f, 6.073f, 14.78f, 5.78f)
            curveTo(15.073f, 5.487f, 15.073f, 5.013f, 14.78f, 4.72f)
            lineTo(12.28f, 2.22f)
            curveTo(11.987f, 1.927f, 11.513f, 1.927f, 11.22f, 2.22f)
            lineTo(8.72f, 4.72f)
            curveTo(8.427f, 5.013f, 8.427f, 5.487f, 8.72f, 5.78f)
            curveTo(9.013f, 6.073f, 9.487f, 6.073f, 9.78f, 5.78f)
            lineTo(11f, 4.561f)
            lineTo(11f, 8.75f)
            curveTo(11f, 9.164f, 11.336f, 9.5f, 11.75f, 9.5f)
            curveTo(12.164f, 9.5f, 12.5f, 9.164f, 12.5f, 8.75f)
            verticalLineTo(4.561f)
            lineTo(13.72f, 5.78f)
            close()
            moveTo(4f, 11.75f)
            curveTo(4f, 11.336f, 4.336f, 11f, 4.75f, 11f)
            horizontalLineTo(19.25f)
            curveTo(19.664f, 11f, 20f, 11.336f, 20f, 11.75f)
            curveTo(20f, 12.164f, 19.664f, 12.5f, 19.25f, 12.5f)
            horizontalLineTo(4.75f)
            curveTo(4.336f, 12.5f, 4f, 12.164f, 4f, 11.75f)
            close()
            moveTo(12.5f, 14.75f)
            curveTo(12.5f, 14.336f, 12.164f, 14f, 11.75f, 14f)
            curveTo(11.336f, 14f, 11f, 14.336f, 11f, 14.75f)
            verticalLineTo(19.439f)
            lineTo(9.78f, 18.22f)
            curveTo(9.487f, 17.927f, 9.013f, 17.927f, 8.72f, 18.22f)
            curveTo(8.427f, 18.513f, 8.427f, 18.987f, 8.72f, 19.28f)
            lineTo(11.22f, 21.78f)
            curveTo(11.513f, 22.073f, 11.987f, 22.073f, 12.28f, 21.78f)
            lineTo(14.78f, 19.28f)
            curveTo(15.073f, 18.987f, 15.073f, 18.513f, 14.78f, 18.22f)
            curveTo(14.487f, 17.927f, 14.013f, 17.927f, 13.72f, 18.22f)
            lineTo(12.5f, 19.439f)
            verticalLineTo(14.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowMaximizeVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowMaximizeVertical, contentDescription = null)
    }
}
