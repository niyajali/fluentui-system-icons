package fluent.ui.system.icons.light

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

public val FluentIcons.Light.TextClearFormatting: ImageVector
    get() {
        if (_TextClearFormatting != null) {
            return _TextClearFormatting!!
        }
        _TextClearFormatting = ImageVector.Builder(
            name = "Light.TextClearFormatting",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18f, 2.5f)
                curveTo(18f, 2.224f, 17.776f, 2f, 17.5f, 2f)
                curveTo(17.224f, 2f, 17f, 2.224f, 17f, 2.5f)
                verticalLineTo(16.672f)
                lineTo(18.618f, 15.054f)
                curveTo(18.232f, 14.341f, 18f, 13.468f, 18f, 12.5f)
                curveTo(18f, 9.905f, 19.665f, 8f, 21.5f, 8f)
                curveTo(23.114f, 8f, 24.598f, 9.475f, 24.931f, 11.597f)
                curveTo(25.291f, 11.674f, 25.643f, 11.797f, 25.979f, 11.966f)
                curveTo(25.762f, 9.266f, 23.925f, 7f, 21.5f, 7f)
                curveTo(20.049f, 7f, 18.809f, 7.811f, 18f, 9.041f)
                verticalLineTo(2.5f)
                close()
                moveTo(9.436f, 2.648f)
                curveTo(9.111f, 1.785f, 7.89f, 1.785f, 7.564f, 2.648f)
                lineTo(2.032f, 17.323f)
                curveTo(1.935f, 17.582f, 2.065f, 17.87f, 2.324f, 17.968f)
                curveTo(2.582f, 18.065f, 2.871f, 17.935f, 2.968f, 17.676f)
                lineTo(4.731f, 13f)
                horizontalLineTo(12.27f)
                lineTo(14.032f, 17.676f)
                curveTo(14.13f, 17.935f, 14.418f, 18.065f, 14.677f, 17.968f)
                curveTo(14.935f, 17.87f, 15.066f, 17.582f, 14.968f, 17.323f)
                lineTo(9.436f, 2.648f)
                close()
                moveTo(11.893f, 12f)
                horizontalLineTo(5.108f)
                lineTo(8.5f, 3.001f)
                lineTo(11.893f, 12f)
                close()
                moveTo(26.058f, 13.851f)
                curveTo(24.921f, 12.714f, 23.079f, 12.714f, 21.942f, 13.851f)
                lineTo(13.851f, 21.942f)
                curveTo(12.714f, 23.079f, 12.714f, 24.921f, 13.851f, 26.058f)
                lineTo(16.942f, 29.149f)
                curveTo(17.536f, 29.743f, 18.323f, 30.027f, 19.101f, 30f)
                horizontalLineTo(26.5f)
                curveTo(26.776f, 30f, 27f, 29.776f, 27f, 29.5f)
                curveTo(27f, 29.224f, 26.776f, 29f, 26.5f, 29f)
                horizontalLineTo(21.207f)
                lineTo(29.149f, 21.058f)
                curveTo(30.286f, 19.921f, 30.286f, 18.079f, 29.149f, 16.942f)
                lineTo(26.058f, 13.851f)
                close()
                moveTo(19f, 29f)
                curveTo(18.987f, 29f, 18.975f, 29f, 18.963f, 29.001f)
                curveTo(18.486f, 28.992f, 18.013f, 28.806f, 17.649f, 28.442f)
                lineTo(14.558f, 25.351f)
                curveTo(13.812f, 24.605f, 13.812f, 23.395f, 14.558f, 22.649f)
                lineTo(16.25f, 20.957f)
                lineTo(22.043f, 26.75f)
                lineTo(20.351f, 28.442f)
                curveTo(19.999f, 28.795f, 19.543f, 28.98f, 19.082f, 29f)
                horizontalLineTo(19f)
                close()
                moveTo(22.649f, 14.558f)
                curveTo(23.395f, 13.812f, 24.605f, 13.812f, 25.351f, 14.558f)
                lineTo(28.442f, 17.649f)
                curveTo(29.188f, 18.395f, 29.188f, 19.605f, 28.442f, 20.351f)
                lineTo(22.75f, 26.043f)
                lineTo(16.957f, 20.25f)
                lineTo(22.649f, 14.558f)
                close()
            }
        }.build()

        return _TextClearFormatting!!
    }

@Suppress("ObjectPropertyName")
private var _TextClearFormatting: ImageVector? = null

@Preview
@Composable
private fun TextClearFormattingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.TextClearFormatting, contentDescription = null)
    }
}
