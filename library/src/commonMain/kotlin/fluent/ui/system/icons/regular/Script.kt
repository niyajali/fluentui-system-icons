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

public val FluentIcons.Regular.Script: ImageVector
    get() {
        if (_Script != null) {
            return _Script!!
        }
        _Script = ImageVector.Builder(
            name = "Regular.Script",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.799f, 2.008f)
                verticalLineTo(2f)
                horizontalLineTo(7.75f)
                curveTo(5.955f, 2f, 4.5f, 3.455f, 4.5f, 5.25f)
                verticalLineTo(15.5f)
                horizontalLineTo(2.75f)
                curveTo(1.783f, 15.5f, 1f, 16.284f, 1f, 17.25f)
                verticalLineTo(19.075f)
                curveTo(1f, 20.765f, 2.377f, 22f, 4f, 22f)
                horizontalLineTo(15.019f)
                verticalLineTo(21.992f)
                curveTo(15.097f, 21.997f, 15.175f, 22f, 15.254f, 22f)
                curveTo(17.014f, 22f, 18.51f, 20.645f, 18.531f, 18.888f)
                lineTo(18.531f, 18.85f)
                verticalLineTo(8.5f)
                lineTo(21.795f, 8.5f)
                curveTo(22.461f, 8.5f, 23f, 7.961f, 23f, 7.295f)
                verticalLineTo(4.984f)
                curveTo(23f, 3.336f, 21.664f, 2f, 20.016f, 2f)
                curveTo(19.943f, 2f, 19.871f, 2.003f, 19.799f, 2.008f)
                close()
                moveTo(7.75f, 3.5f)
                horizontalLineTo(17.426f)
                curveTo(17.175f, 3.937f, 17.032f, 4.444f, 17.032f, 4.984f)
                lineTo(17.031f, 18.85f)
                curveTo(17.031f, 19.725f, 16.272f, 20.5f, 15.254f, 20.5f)
                curveTo(14.235f, 20.5f, 13.477f, 19.725f, 13.477f, 18.85f)
                verticalLineTo(16.75f)
                curveTo(13.477f, 16.06f, 12.917f, 15.5f, 12.227f, 15.5f)
                horizontalLineTo(6f)
                verticalLineTo(5.25f)
                curveTo(6f, 4.284f, 6.784f, 3.5f, 7.75f, 3.5f)
                close()
                moveTo(2.75f, 17f)
                horizontalLineTo(11.977f)
                verticalLineTo(18.85f)
                curveTo(11.977f, 19.461f, 12.155f, 20.024f, 12.46f, 20.5f)
                horizontalLineTo(4f)
                curveTo(3.138f, 20.5f, 2.5f, 19.871f, 2.5f, 19.075f)
                verticalLineTo(17.25f)
                curveTo(2.5f, 17.112f, 2.612f, 17f, 2.75f, 17f)
                close()
                moveTo(21.5f, 4.984f)
                verticalLineTo(7f)
                lineTo(18.532f, 7f)
                lineTo(18.532f, 4.984f)
                curveTo(18.532f, 4.165f, 19.196f, 3.5f, 20.016f, 3.5f)
                curveTo(20.836f, 3.5f, 21.5f, 4.164f, 21.5f, 4.984f)
                close()
            }
        }.build()

        return _Script!!
    }

@Suppress("ObjectPropertyName")
private var _Script: ImageVector? = null

@Preview
@Composable
private fun ScriptPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Script, contentDescription = null)
    }
}
