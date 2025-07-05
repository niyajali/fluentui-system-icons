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
 * TextWordCount Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_word_count_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextWordCount icon.
 */
public val FluentIcons.Regular.TextWordCount: ImageVector
    get() {
        if (_textWordCount != null) {
            return _textWordCount!!
        }
        _textWordCount = Builder(name = "TextWordCount", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 5.75f)
                curveTo(2.0f, 5.336f, 2.336f, 5.0f, 2.75f, 5.0f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 5.0f, 22.0f, 5.336f, 22.0f, 5.75f)
                curveTo(22.0f, 6.164f, 21.664f, 6.5f, 21.25f, 6.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 6.5f, 2.0f, 6.164f, 2.0f, 5.75f)
                close()
                moveTo(2.0f, 12.25f)
                curveTo(2.0f, 11.836f, 2.336f, 11.5f, 2.75f, 11.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 11.5f, 22.0f, 11.836f, 22.0f, 12.25f)
                curveTo(22.0f, 12.664f, 21.664f, 13.0f, 21.25f, 13.0f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 13.0f, 2.0f, 12.664f, 2.0f, 12.25f)
                close()
                moveTo(19.0f, 18.75f)
                curveTo(19.0f, 18.336f, 19.336f, 18.0f, 19.75f, 18.0f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 18.0f, 22.0f, 18.336f, 22.0f, 18.75f)
                curveTo(22.0f, 19.164f, 21.664f, 19.5f, 21.25f, 19.5f)
                horizontalLineTo(19.75f)
                curveTo(19.336f, 19.5f, 19.0f, 19.164f, 19.0f, 18.75f)
                close()
                moveTo(2.416f, 18.738f)
                curveTo(2.627f, 18.597f, 2.831f, 18.438f, 3.023f, 18.263f)
                verticalLineTo(22.25f)
                curveTo(3.023f, 22.664f, 3.359f, 23.0f, 3.773f, 23.0f)
                curveTo(4.188f, 23.0f, 4.523f, 22.664f, 4.523f, 22.25f)
                verticalLineTo(15.75f)
                curveTo(4.523f, 15.356f, 4.22f, 15.033f, 3.834f, 15.002f)
                curveTo(3.465f, 14.972f, 3.121f, 15.218f, 3.04f, 15.59f)
                curveTo(2.914f, 16.168f, 2.348f, 16.98f, 1.584f, 17.49f)
                curveTo(1.239f, 17.719f, 1.146f, 18.185f, 1.376f, 18.53f)
                curveTo(1.606f, 18.874f, 2.071f, 18.967f, 2.416f, 18.738f)
                close()
                moveTo(8.0f, 17.523f)
                curveTo(8.0f, 16.995f, 8.444f, 16.5f, 8.986f, 16.5f)
                curveTo(9.393f, 16.5f, 9.721f, 16.691f, 9.879f, 16.934f)
                curveTo(10.015f, 17.143f, 10.097f, 17.5f, 9.786f, 18.029f)
                curveTo(9.636f, 18.284f, 9.41f, 18.511f, 9.104f, 18.753f)
                curveTo(8.952f, 18.874f, 8.788f, 18.99f, 8.611f, 19.116f)
                lineTo(8.537f, 19.168f)
                curveTo(8.385f, 19.275f, 8.222f, 19.39f, 8.065f, 19.509f)
                curveTo(7.321f, 20.068f, 6.5f, 20.854f, 6.5f, 22.25f)
                curveTo(6.5f, 22.664f, 6.836f, 23.0f, 7.25f, 23.0f)
                lineTo(7.258f, 23.0f)
                lineTo(7.266f, 23.0f)
                horizontalLineTo(10.701f)
                curveTo(11.115f, 23.0f, 11.451f, 22.664f, 11.451f, 22.25f)
                curveTo(11.451f, 21.836f, 11.115f, 21.5f, 10.701f, 21.5f)
                horizontalLineTo(8.188f)
                curveTo(8.348f, 21.218f, 8.611f, 20.975f, 8.967f, 20.707f)
                curveTo(9.104f, 20.604f, 9.246f, 20.504f, 9.399f, 20.396f)
                lineTo(9.477f, 20.341f)
                curveTo(9.655f, 20.215f, 9.847f, 20.077f, 10.034f, 19.93f)
                curveTo(10.406f, 19.636f, 10.795f, 19.273f, 11.079f, 18.789f)
                curveTo(11.636f, 17.841f, 11.625f, 16.868f, 11.137f, 16.117f)
                curveTo(10.67f, 15.4f, 9.841f, 15.0f, 8.986f, 15.0f)
                curveTo(7.508f, 15.0f, 6.5f, 16.278f, 6.5f, 17.523f)
                curveTo(6.5f, 17.937f, 6.836f, 18.273f, 7.25f, 18.273f)
                curveTo(7.664f, 18.273f, 8.0f, 17.937f, 8.0f, 17.523f)
                close()
                moveTo(14.471f, 17.138f)
                curveTo(14.503f, 17.025f, 14.58f, 16.867f, 14.722f, 16.741f)
                curveTo(14.85f, 16.628f, 15.078f, 16.5f, 15.5f, 16.5f)
                curveTo(16.261f, 16.5f, 16.5f, 17.0f, 16.5f, 17.227f)
                curveTo(16.5f, 17.472f, 16.448f, 17.718f, 16.31f, 17.891f)
                curveTo(16.199f, 18.031f, 15.932f, 18.25f, 15.208f, 18.25f)
                curveTo(14.794f, 18.25f, 14.458f, 18.586f, 14.458f, 19.0f)
                curveTo(14.458f, 19.414f, 14.794f, 19.75f, 15.208f, 19.75f)
                curveTo(15.482f, 19.75f, 15.86f, 19.786f, 16.143f, 19.919f)
                curveTo(16.274f, 19.981f, 16.357f, 20.051f, 16.407f, 20.121f)
                curveTo(16.452f, 20.184f, 16.5f, 20.287f, 16.5f, 20.477f)
                curveTo(16.5f, 20.965f, 16.348f, 21.181f, 16.219f, 21.289f)
                curveTo(16.068f, 21.417f, 15.824f, 21.5f, 15.5f, 21.5f)
                curveTo(15.138f, 21.5f, 14.933f, 21.437f, 14.807f, 21.358f)
                curveTo(14.696f, 21.287f, 14.568f, 21.154f, 14.462f, 20.834f)
                curveTo(14.333f, 20.44f, 13.909f, 20.226f, 13.516f, 20.356f)
                curveTo(13.122f, 20.485f, 12.908f, 20.909f, 13.038f, 21.303f)
                curveTo(13.224f, 21.869f, 13.533f, 22.326f, 14.005f, 22.625f)
                curveTo(14.463f, 22.915f, 14.987f, 23.0f, 15.5f, 23.0f)
                curveTo(16.051f, 23.0f, 16.682f, 22.862f, 17.187f, 22.435f)
                curveTo(17.715f, 21.99f, 18.0f, 21.319f, 18.0f, 20.477f)
                curveTo(18.0f, 20.003f, 17.87f, 19.589f, 17.629f, 19.25f)
                curveTo(17.55f, 19.14f, 17.463f, 19.042f, 17.371f, 18.956f)
                curveTo(17.41f, 18.913f, 17.448f, 18.869f, 17.484f, 18.824f)
                curveTo(17.922f, 18.273f, 18.0f, 17.632f, 18.0f, 17.227f)
                curveTo(18.0f, 16.154f, 17.072f, 15.0f, 15.5f, 15.0f)
                curveTo(14.734f, 15.0f, 14.149f, 15.247f, 13.73f, 15.616f)
                curveTo(13.325f, 15.973f, 13.12f, 16.405f, 13.029f, 16.726f)
                curveTo(12.915f, 17.124f, 13.146f, 17.539f, 13.544f, 17.653f)
                curveTo(13.942f, 17.767f, 14.357f, 17.536f, 14.471f, 17.138f)
                close()
            }
        }
        .build()
        return _textWordCount!!
    }

@Suppress("ObjectPropertyName")
private var _textWordCount: ImageVector? = null

@Preview
@Composable
private fun TextWordCountPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextWordCount, contentDescription = "TextWordCount Icon")
    }
}

