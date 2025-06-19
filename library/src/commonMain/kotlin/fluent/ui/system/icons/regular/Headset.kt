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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.Headset: ImageVector
    get() {
        if (_Headset != null) {
            return _Headset!!
        }
        _Headset = ImageVector.Builder(
            name = "Regular.Headset",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 18.5f)
                curveTo(11.586f, 18.5f, 11.25f, 18.836f, 11.25f, 19.25f)
                curveTo(11.25f, 19.664f, 11.586f, 20f, 12f, 20f)
                curveTo(12.414f, 20f, 12.75f, 19.664f, 12.75f, 19.25f)
                curveTo(12.75f, 18.836f, 12.414f, 18.5f, 12f, 18.5f)
                close()
                moveTo(17.5f, 10f)
                verticalLineTo(9f)
                curveTo(17.5f, 5.962f, 15.038f, 3.5f, 12f, 3.5f)
                curveTo(8.962f, 3.5f, 6.5f, 5.962f, 6.5f, 9f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                curveTo(9.552f, 10f, 10f, 10.448f, 10f, 11f)
                verticalLineTo(15f)
                curveTo(10f, 15.552f, 9.552f, 16f, 9f, 16f)
                horizontalLineTo(6.5f)
                verticalLineTo(16.25f)
                curveTo(6.5f, 17.441f, 7.425f, 18.416f, 8.596f, 18.495f)
                lineTo(8.75f, 18.5f)
                lineTo(9.878f, 18.5f)
                curveTo(10.187f, 17.626f, 11.02f, 17f, 12f, 17f)
                curveTo(13.243f, 17f, 14.25f, 18.007f, 14.25f, 19.25f)
                curveTo(14.25f, 20.493f, 13.243f, 21.5f, 12f, 21.5f)
                curveTo(11.02f, 21.5f, 10.186f, 20.874f, 9.878f, 19.999f)
                lineTo(8.75f, 20f)
                curveTo(6.746f, 20f, 5.109f, 18.428f, 5.005f, 16.449f)
                lineTo(5f, 16.25f)
                verticalLineTo(9f)
                curveTo(5f, 5.134f, 8.134f, 2f, 12f, 2f)
                curveTo(15.866f, 2f, 19f, 5.134f, 19f, 9f)
                verticalLineTo(14f)
                curveTo(19f, 15.054f, 18.184f, 15.918f, 17.149f, 15.995f)
                lineTo(17f, 16f)
                horizontalLineTo(15f)
                curveTo(14.487f, 16f, 14.064f, 15.614f, 14.007f, 15.117f)
                lineTo(14f, 15f)
                verticalLineTo(11f)
                curveTo(14f, 10.487f, 14.386f, 10.064f, 14.883f, 10.007f)
                lineTo(15f, 10f)
                horizontalLineTo(17.5f)
                close()
                moveTo(8.5f, 11.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(11.5f)
                close()
                moveTo(17.5f, 11.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(17f)
                curveTo(17.246f, 14.5f, 17.45f, 14.323f, 17.492f, 14.09f)
                lineTo(17.5f, 14f)
                verticalLineTo(11.5f)
                close()
            }
        }.build()

        return _Headset!!
    }

@Suppress("ObjectPropertyName")
private var _Headset: ImageVector? = null

@Preview
@Composable
private fun HeadsetPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Headset, contentDescription = null)
    }
}
