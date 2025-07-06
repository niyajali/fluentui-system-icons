/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * TextNumberListRotate270 Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios. Contains directional and rotational variants. Collection includes Task List & Bullet List.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_number_list_rotate_270_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextNumberListRotate270 icon.
 */
public val FluentIcons.Regular.TextNumberListRotate270: ImageVector
    get() {
        if (_textNumberListRotate270 != null) {
            return _textNumberListRotate270!!
        }
        _textNumberListRotate270 = Builder(name = "TextNumberListRotate270", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.75f, 18.0f)
                curveTo(2.396f, 18.0f, 2.09f, 18.248f, 2.016f, 18.594f)
                curveTo(1.943f, 18.94f, 2.121f, 19.29f, 2.443f, 19.434f)
                lineTo(2.446f, 19.436f)
                curveTo(2.451f, 19.438f, 2.459f, 19.442f, 2.47f, 19.447f)
                curveTo(2.494f, 19.459f, 2.531f, 19.477f, 2.578f, 19.503f)
                curveTo(2.674f, 19.555f, 2.81f, 19.634f, 2.963f, 19.741f)
                curveTo(3.275f, 19.958f, 3.625f, 20.265f, 3.864f, 20.647f)
                curveTo(4.083f, 20.999f, 4.546f, 21.105f, 4.897f, 20.886f)
                curveTo(5.249f, 20.667f, 5.356f, 20.204f, 5.136f, 19.853f)
                curveTo(5.058f, 19.728f, 4.975f, 19.61f, 4.888f, 19.5f)
                lineTo(7.25f, 19.5f)
                curveTo(7.664f, 19.5f, 8.0f, 19.164f, 8.0f, 18.75f)
                curveTo(8.0f, 18.336f, 7.664f, 18.0f, 7.25f, 18.0f)
                lineTo(2.75f, 18.0f)
                close()
                moveTo(18.75f, 3.5f)
                curveTo(18.336f, 3.5f, 18.0f, 3.836f, 18.0f, 4.25f)
                verticalLineTo(13.25f)
                curveTo(18.0f, 13.665f, 18.336f, 14.0f, 18.75f, 14.0f)
                curveTo(19.164f, 14.0f, 19.5f, 13.665f, 19.5f, 13.25f)
                verticalLineTo(4.25f)
                curveTo(19.5f, 3.836f, 19.164f, 3.5f, 18.75f, 3.5f)
                close()
                moveTo(12.244f, 3.5f)
                curveTo(11.83f, 3.5f, 11.494f, 3.836f, 11.494f, 4.25f)
                verticalLineTo(13.25f)
                curveTo(11.494f, 13.665f, 11.83f, 14.0f, 12.244f, 14.0f)
                curveTo(12.658f, 14.0f, 12.994f, 13.665f, 12.994f, 13.25f)
                verticalLineTo(4.25f)
                curveTo(12.994f, 3.836f, 12.658f, 3.5f, 12.244f, 3.5f)
                close()
                moveTo(5.75f, 3.5f)
                curveTo(5.336f, 3.5f, 5.0f, 3.836f, 5.0f, 4.25f)
                lineTo(5.0f, 13.25f)
                curveTo(5.0f, 13.665f, 5.336f, 14.0f, 5.75f, 14.0f)
                curveTo(6.164f, 14.0f, 6.5f, 13.665f, 6.5f, 13.25f)
                verticalLineTo(4.25f)
                curveTo(6.5f, 3.836f, 6.164f, 3.5f, 5.75f, 3.5f)
                close()
                moveTo(10.52f, 18.849f)
                curveTo(10.467f, 19.15f, 10.586f, 19.526f, 10.781f, 19.72f)
                curveTo(11.073f, 20.013f, 11.073f, 20.487f, 10.78f, 20.78f)
                curveTo(10.488f, 21.073f, 10.013f, 21.073f, 9.72f, 20.78f)
                curveTo(9.164f, 20.224f, 8.908f, 19.35f, 9.043f, 18.588f)
                curveTo(9.113f, 18.191f, 9.297f, 17.783f, 9.648f, 17.473f)
                curveTo(10.006f, 17.157f, 10.473f, 17.0f, 11.0f, 17.0f)
                curveTo(11.62f, 17.0f, 12.08f, 17.271f, 12.421f, 17.606f)
                curveTo(12.703f, 17.884f, 12.931f, 18.237f, 13.109f, 18.512f)
                lineTo(13.16f, 18.591f)
                curveTo(13.287f, 18.787f, 13.397f, 18.946f, 13.5f, 19.073f)
                verticalLineTo(17.75f)
                curveTo(13.5f, 17.336f, 13.836f, 17.0f, 14.25f, 17.0f)
                curveTo(14.664f, 17.0f, 15.0f, 17.336f, 15.0f, 17.75f)
                verticalLineTo(20.25f)
                curveTo(15.0f, 20.664f, 14.664f, 21.0f, 14.25f, 21.0f)
                curveTo(12.936f, 21.0f, 12.297f, 20.016f, 11.913f, 19.425f)
                lineTo(11.874f, 19.365f)
                curveTo(11.668f, 19.047f, 11.528f, 18.832f, 11.369f, 18.675f)
                curveTo(11.233f, 18.542f, 11.131f, 18.5f, 11.0f, 18.5f)
                curveTo(10.778f, 18.5f, 10.682f, 18.561f, 10.641f, 18.597f)
                curveTo(10.594f, 18.639f, 10.544f, 18.715f, 10.52f, 18.849f)
                close()
                moveTo(21.28f, 21.03f)
                curveTo(21.28f, 21.03f, 21.364f, 20.938f, 21.285f, 21.026f)
                lineTo(21.29f, 21.02f)
                lineTo(21.303f, 21.007f)
                curveTo(21.312f, 20.997f, 21.323f, 20.985f, 21.336f, 20.97f)
                curveTo(21.361f, 20.941f, 21.393f, 20.903f, 21.428f, 20.856f)
                curveTo(21.499f, 20.762f, 21.586f, 20.63f, 21.671f, 20.46f)
                curveTo(21.842f, 20.119f, 22.0f, 19.63f, 22.0f, 19.0f)
                curveTo(22.0f, 18.361f, 21.819f, 17.804f, 21.461f, 17.399f)
                curveTo(21.1f, 16.991f, 20.603f, 16.788f, 20.101f, 16.805f)
                curveTo(19.685f, 16.818f, 19.305f, 16.971f, 19.0f, 17.23f)
                curveTo(18.695f, 16.971f, 18.316f, 16.818f, 17.899f, 16.805f)
                curveTo(17.397f, 16.788f, 16.9f, 16.991f, 16.54f, 17.399f)
                curveTo(16.181f, 17.804f, 16.0f, 18.361f, 16.0f, 19.0f)
                curveTo(16.0f, 19.63f, 16.158f, 20.119f, 16.329f, 20.46f)
                curveTo(16.414f, 20.63f, 16.501f, 20.762f, 16.572f, 20.856f)
                curveTo(16.607f, 20.903f, 16.639f, 20.941f, 16.664f, 20.97f)
                curveTo(16.677f, 20.985f, 16.688f, 20.997f, 16.697f, 21.007f)
                lineTo(16.71f, 21.02f)
                lineTo(16.715f, 21.026f)
                lineTo(16.718f, 21.028f)
                lineTo(16.719f, 21.029f)
                lineTo(16.72f, 21.03f)
                curveTo(17.013f, 21.323f, 17.487f, 21.323f, 17.78f, 21.03f)
                curveTo(18.069f, 20.741f, 18.073f, 20.275f, 17.792f, 19.982f)
                curveTo(17.789f, 19.978f, 17.782f, 19.97f, 17.772f, 19.956f)
                curveTo(17.749f, 19.926f, 17.711f, 19.87f, 17.671f, 19.79f)
                curveTo(17.592f, 19.631f, 17.5f, 19.37f, 17.5f, 19.0f)
                curveTo(17.5f, 18.639f, 17.6f, 18.464f, 17.664f, 18.392f)
                curveTo(17.725f, 18.322f, 17.791f, 18.302f, 17.851f, 18.304f)
                curveTo(17.916f, 18.306f, 18.003f, 18.336f, 18.082f, 18.427f)
                curveTo(18.159f, 18.515f, 18.25f, 18.69f, 18.25f, 19.0f)
                curveTo(18.25f, 19.414f, 18.586f, 19.75f, 19.0f, 19.75f)
                curveTo(19.414f, 19.75f, 19.75f, 19.414f, 19.75f, 19.0f)
                curveTo(19.75f, 18.69f, 19.842f, 18.515f, 19.918f, 18.427f)
                curveTo(19.997f, 18.336f, 20.084f, 18.306f, 20.149f, 18.304f)
                curveTo(20.209f, 18.302f, 20.275f, 18.322f, 20.337f, 18.392f)
                curveTo(20.4f, 18.464f, 20.5f, 18.639f, 20.5f, 19.0f)
                curveTo(20.5f, 19.37f, 20.408f, 19.631f, 20.329f, 19.79f)
                curveTo(20.289f, 19.87f, 20.251f, 19.926f, 20.228f, 19.956f)
                curveTo(20.218f, 19.97f, 20.211f, 19.978f, 20.208f, 19.982f)
                curveTo(19.927f, 20.275f, 19.931f, 20.741f, 20.22f, 21.03f)
                curveTo(20.513f, 21.323f, 20.987f, 21.323f, 21.28f, 21.03f)
                close()
                moveTo(16.718f, 21.028f)
                lineTo(16.719f, 21.029f)
                curveTo(16.713f, 21.022f, 16.552f, 20.828f, 16.718f, 21.028f)
                close()
            }
        }
        .build()
        return _textNumberListRotate270!!
    }

@Suppress("ObjectPropertyName")
private var _textNumberListRotate270: ImageVector? = null

@Preview
@Composable
private fun TextNumberListRotate270Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextNumberListRotate270, contentDescription = "TextNumberListRotate270 Icon")
    }
}

