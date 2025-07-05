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
 * TextFootnote Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios. Contains locale specific scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_footnote_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextFootnote icon.
 */
public val FluentIcons.Regular.TextFootnote: ImageVector
    get() {
        if (_textFootnote != null) {
            return _textFootnote!!
        }
        _textFootnote = Builder(name = "TextFootnote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.5f, 7.263f)
                curveTo(20.307f, 7.438f, 20.103f, 7.597f, 19.893f, 7.738f)
                curveTo(19.548f, 7.968f, 19.082f, 7.874f, 18.853f, 7.53f)
                curveTo(18.623f, 7.185f, 18.716f, 6.72f, 19.061f, 6.49f)
                curveTo(19.825f, 5.98f, 20.39f, 5.169f, 20.517f, 4.59f)
                curveTo(20.597f, 4.223f, 20.934f, 3.978f, 21.298f, 4.002f)
                curveTo(21.69f, 4.026f, 22.0f, 4.352f, 22.0f, 4.75f)
                verticalLineTo(11.25f)
                curveTo(22.0f, 11.664f, 21.664f, 12.0f, 21.25f, 12.0f)
                curveTo(20.836f, 12.0f, 20.5f, 11.664f, 20.5f, 11.25f)
                verticalLineTo(7.263f)
                close()
                moveTo(12.222f, 17.756f)
                curveTo(12.068f, 17.588f, 12.0f, 17.378f, 12.0f, 17.147f)
                verticalLineTo(7.91f)
                curveTo(12.0f, 7.664f, 12.074f, 7.442f, 12.237f, 7.265f)
                lineTo(12.24f, 7.261f)
                curveTo(12.408f, 7.086f, 12.624f, 7.0f, 12.868f, 7.0f)
                curveTo(13.111f, 7.0f, 13.325f, 7.086f, 13.49f, 7.263f)
                curveTo(13.658f, 7.439f, 13.735f, 7.662f, 13.735f, 7.91f)
                verticalLineTo(10.751f)
                curveTo(13.918f, 10.559f, 14.126f, 10.395f, 14.36f, 10.258f)
                lineTo(14.361f, 10.257f)
                curveTo(14.818f, 9.992f, 15.328f, 9.861f, 15.885f, 9.861f)
                curveTo(16.889f, 9.861f, 17.713f, 10.24f, 18.336f, 10.996f)
                curveTo(18.954f, 11.748f, 19.251f, 12.734f, 19.251f, 13.931f)
                curveTo(19.251f, 15.131f, 18.955f, 16.121f, 18.336f, 16.872f)
                curveTo(17.712f, 17.624f, 16.88f, 18.0f, 15.864f, 18.0f)
                curveTo(15.294f, 18.0f, 14.777f, 17.87f, 14.318f, 17.604f)
                lineTo(14.317f, 17.604f)
                curveTo(14.079f, 17.464f, 13.866f, 17.294f, 13.679f, 17.096f)
                verticalLineTo(17.147f)
                curveTo(13.679f, 17.382f, 13.6f, 17.592f, 13.435f, 17.757f)
                curveTo(13.27f, 17.921f, 13.06f, 18.0f, 12.825f, 18.0f)
                curveTo(12.594f, 18.0f, 12.385f, 17.926f, 12.226f, 17.76f)
                lineTo(12.222f, 17.756f)
                close()
                moveTo(16.972f, 15.78f)
                curveTo(17.307f, 15.345f, 17.488f, 14.737f, 17.488f, 13.931f)
                curveTo(17.488f, 13.129f, 17.307f, 12.524f, 16.972f, 12.088f)
                curveTo(16.643f, 11.661f, 16.202f, 11.447f, 15.622f, 11.447f)
                curveTo(15.071f, 11.447f, 14.627f, 11.664f, 14.27f, 12.113f)
                curveTo(13.916f, 12.559f, 13.728f, 13.158f, 13.728f, 13.931f)
                curveTo(13.728f, 14.709f, 13.917f, 15.309f, 14.27f, 15.755f)
                curveTo(14.626f, 16.199f, 15.071f, 16.414f, 15.622f, 16.414f)
                curveTo(16.203f, 16.414f, 16.644f, 16.202f, 16.972f, 15.78f)
                close()
                moveTo(2.0f, 17.186f)
                curveTo(2.0f, 17.421f, 2.093f, 17.624f, 2.269f, 17.78f)
                lineTo(2.277f, 17.787f)
                curveTo(2.457f, 17.934f, 2.676f, 18.0f, 2.916f, 18.0f)
                curveTo(3.12f, 18.0f, 3.308f, 17.946f, 3.467f, 17.826f)
                curveTo(3.623f, 17.708f, 3.732f, 17.539f, 3.803f, 17.342f)
                lineTo(4.682f, 14.952f)
                horizontalLineTo(8.561f)
                lineTo(9.447f, 17.342f)
                lineTo(9.448f, 17.344f)
                curveTo(9.519f, 17.54f, 9.627f, 17.708f, 9.783f, 17.826f)
                curveTo(9.942f, 17.946f, 10.13f, 18.0f, 10.334f, 18.0f)
                curveTo(10.574f, 18.0f, 10.793f, 17.933f, 10.97f, 17.783f)
                curveTo(11.151f, 17.629f, 11.25f, 17.425f, 11.25f, 17.186f)
                curveTo(11.25f, 17.048f, 11.211f, 16.896f, 11.152f, 16.74f)
                lineTo(7.71f, 7.774f)
                curveTo(7.618f, 7.537f, 7.484f, 7.339f, 7.297f, 7.202f)
                curveTo(7.108f, 7.064f, 6.884f, 7.0f, 6.64f, 7.0f)
                curveTo(6.386f, 7.0f, 6.154f, 7.063f, 5.958f, 7.202f)
                curveTo(5.764f, 7.34f, 5.625f, 7.54f, 5.533f, 7.782f)
                lineTo(2.098f, 16.74f)
                curveTo(2.038f, 16.896f, 2.0f, 17.048f, 2.0f, 17.186f)
                close()
                moveTo(6.625f, 9.583f)
                lineTo(8.0f, 13.36f)
                horizontalLineTo(5.25f)
                lineTo(6.625f, 9.583f)
                close()
            }
        }
        .build()
        return _textFootnote!!
    }

@Suppress("ObjectPropertyName")
private var _textFootnote: ImageVector? = null

@Preview
@Composable
private fun TextFootnotePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextFootnote, contentDescription = "TextFootnote Icon")
    }
}

