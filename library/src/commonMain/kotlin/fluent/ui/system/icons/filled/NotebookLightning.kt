package fluent.ui.system.icons.filled

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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.NotebookLightning: ImageVector
    get() {
        if (_NotebookLightning != null) {
            return _NotebookLightning!!
        }
        _NotebookLightning = ImageVector.Builder(
            name = "Filled.NotebookLightning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.749f, 2f)
                curveTo(17.992f, 2f, 18.999f, 3.007f, 18.999f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(18.999f, 20.993f, 17.992f, 22f, 16.749f, 22f)
                horizontalLineTo(7.974f)
                lineTo(11.563f, 17.903f)
                curveTo(12.507f, 16.825f, 11.822f, 15.165f, 10.453f, 15.012f)
                lineTo(11.453f, 13.235f)
                curveTo(12.015f, 12.236f, 11.292f, 11f, 10.145f, 11f)
                horizontalLineTo(5.318f)
                curveTo(4.766f, 11f, 4.262f, 11.302f, 4f, 11.783f)
                verticalLineTo(4.25f)
                curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
                horizontalLineTo(16.749f)
                close()
                moveTo(14.754f, 5.497f)
                horizontalLineTo(8.251f)
                curveTo(7.872f, 5.497f, 7.558f, 5.78f, 7.508f, 6.146f)
                lineTo(7.501f, 6.247f)
                verticalLineTo(7.751f)
                curveTo(7.501f, 8.131f, 7.784f, 8.444f, 8.15f, 8.494f)
                lineTo(8.251f, 8.501f)
                horizontalLineTo(14.754f)
                curveTo(15.133f, 8.501f, 15.447f, 8.219f, 15.497f, 7.853f)
                lineTo(15.504f, 7.751f)
                verticalLineTo(6.247f)
                curveTo(15.504f, 5.833f, 15.168f, 5.497f, 14.754f, 5.497f)
                close()
                moveTo(20f, 15.002f)
                horizontalLineTo(20.75f)
                curveTo(21.13f, 15.002f, 21.444f, 15.284f, 21.493f, 15.65f)
                lineTo(21.5f, 15.752f)
                verticalLineTo(17.25f)
                curveTo(21.5f, 17.63f, 21.218f, 17.944f, 20.852f, 17.993f)
                lineTo(20.75f, 18f)
                horizontalLineTo(20f)
                verticalLineTo(15.002f)
                close()
                moveTo(20f, 11.002f)
                horizontalLineTo(20.75f)
                curveTo(21.13f, 11.002f, 21.444f, 11.284f, 21.493f, 11.65f)
                lineTo(21.5f, 11.752f)
                verticalLineTo(13.25f)
                curveTo(21.5f, 13.63f, 21.218f, 13.943f, 20.852f, 13.993f)
                lineTo(20.75f, 14f)
                horizontalLineTo(20f)
                verticalLineTo(11.002f)
                close()
                moveTo(20f, 7.002f)
                horizontalLineTo(20.75f)
                curveTo(21.13f, 7.002f, 21.444f, 7.284f, 21.493f, 7.65f)
                lineTo(21.5f, 7.752f)
                verticalLineTo(9.25f)
                curveTo(21.5f, 9.63f, 21.218f, 9.943f, 20.852f, 9.993f)
                lineTo(20.75f, 10f)
                horizontalLineTo(20f)
                verticalLineTo(7.002f)
                close()
                moveTo(5.318f, 12f)
                horizontalLineTo(10.145f)
                curveTo(10.528f, 12f, 10.769f, 12.412f, 10.581f, 12.745f)
                lineTo(8.75f, 16f)
                horizontalLineTo(10.246f)
                curveTo(10.891f, 16f, 11.235f, 16.759f, 10.811f, 17.244f)
                lineTo(5.987f, 22.752f)
                curveTo(5.482f, 23.328f, 4.544f, 22.837f, 4.729f, 22.094f)
                lineTo(5.5f, 19f)
                horizontalLineTo(2.498f)
                curveTo(2.131f, 19f, 1.889f, 18.619f, 2.045f, 18.287f)
                lineTo(4.865f, 12.287f)
                curveTo(4.948f, 12.112f, 5.124f, 12f, 5.318f, 12f)
                close()
            }
        }.build()

        return _NotebookLightning!!
    }

@Suppress("ObjectPropertyName")
private var _NotebookLightning: ImageVector? = null

@Preview
@Composable
private fun NotebookLightningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.NotebookLightning, contentDescription = null)
    }
}
