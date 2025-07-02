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
 * TextWholeWord icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: text, whole, word
 * - Source: ic_fluent_text_whole_word_20_regular.svg
 * 
 * @return The [ImageVector] for the TextWholeWord icon.
 */
public val FluentIcons.Regular.TextWholeWord: ImageVector
    get() {
        if (_textWholeWord != null) {
            return _textWholeWord!!
        }
        _textWholeWord = Builder(name = "TextWholeWord", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.5f, 15.0f)
                curveTo(11.633f, 15.0f, 11.76f, 14.947f, 11.854f, 14.854f)
                curveTo(11.947f, 14.76f, 12.0f, 14.633f, 12.0f, 14.5f)
                verticalLineTo(14.109f)
                curveTo(12.255f, 14.386f, 12.564f, 14.608f, 12.908f, 14.761f)
                curveTo(13.252f, 14.914f, 13.623f, 14.995f, 14.0f, 15.0f)
                curveTo(14.86f, 14.929f, 15.657f, 14.521f, 16.219f, 13.866f)
                curveTo(16.78f, 13.211f, 17.061f, 12.361f, 17.0f, 11.5f)
                curveTo(17.061f, 10.639f, 16.78f, 9.789f, 16.219f, 9.134f)
                curveTo(15.657f, 8.479f, 14.86f, 8.071f, 14.0f, 8.0f)
                curveTo(13.623f, 8.005f, 13.252f, 8.086f, 12.908f, 8.239f)
                curveTo(12.564f, 8.392f, 12.255f, 8.614f, 12.0f, 8.891f)
                verticalLineTo(4.0f)
                curveTo(12.0f, 3.867f, 11.947f, 3.74f, 11.854f, 3.646f)
                curveTo(11.76f, 3.553f, 11.633f, 3.5f, 11.5f, 3.5f)
                curveTo(11.367f, 3.5f, 11.24f, 3.553f, 11.146f, 3.646f)
                curveTo(11.053f, 3.74f, 11.0f, 3.867f, 11.0f, 4.0f)
                verticalLineTo(14.5f)
                curveTo(11.0f, 14.633f, 11.053f, 14.76f, 11.146f, 14.854f)
                curveTo(11.24f, 14.947f, 11.367f, 15.0f, 11.5f, 15.0f)
                close()
                moveTo(14.0f, 9.0f)
                curveTo(14.594f, 9.073f, 15.136f, 9.375f, 15.509f, 9.842f)
                curveTo(15.883f, 10.31f, 16.059f, 10.905f, 16.0f, 11.5f)
                curveTo(16.059f, 12.095f, 15.883f, 12.69f, 15.509f, 13.158f)
                curveTo(15.136f, 13.625f, 14.594f, 13.927f, 14.0f, 14.0f)
                curveTo(13.406f, 13.927f, 12.864f, 13.625f, 12.491f, 13.158f)
                curveTo(12.117f, 12.69f, 11.941f, 12.095f, 12.0f, 11.5f)
                curveTo(11.941f, 10.905f, 12.117f, 10.31f, 12.491f, 9.842f)
                curveTo(12.864f, 9.375f, 13.406f, 9.073f, 14.0f, 9.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(4.871f, 14.884f)
                curveTo(5.419f, 14.995f, 5.985f, 14.982f, 6.526f, 14.844f)
                curveTo(7.068f, 14.706f, 7.572f, 14.448f, 8.0f, 14.089f)
                verticalLineTo(14.5f)
                curveTo(8.0f, 14.633f, 8.053f, 14.76f, 8.146f, 14.854f)
                curveTo(8.24f, 14.947f, 8.367f, 15.0f, 8.5f, 15.0f)
                curveTo(8.633f, 15.0f, 8.76f, 14.947f, 8.854f, 14.854f)
                curveTo(8.947f, 14.76f, 9.0f, 14.633f, 9.0f, 14.5f)
                verticalLineTo(10.462f)
                curveTo(9.051f, 9.979f, 8.956f, 9.492f, 8.729f, 9.063f)
                curveTo(8.502f, 8.634f, 8.152f, 8.282f, 7.724f, 8.053f)
                curveTo(7.141f, 7.778f, 6.499f, 7.653f, 5.856f, 7.688f)
                curveTo(5.31f, 7.701f, 4.772f, 7.825f, 4.276f, 8.053f)
                curveTo(4.157f, 8.112f, 4.067f, 8.216f, 4.026f, 8.342f)
                curveTo(3.984f, 8.468f, 3.994f, 8.605f, 4.053f, 8.724f)
                curveTo(4.112f, 8.843f, 4.216f, 8.933f, 4.342f, 8.974f)
                curveTo(4.468f, 9.016f, 4.605f, 9.006f, 4.724f, 8.947f)
                curveTo(5.093f, 8.784f, 5.491f, 8.695f, 5.894f, 8.687f)
                curveTo(6.369f, 8.659f, 6.844f, 8.748f, 7.276f, 8.947f)
                curveTo(7.514f, 9.07f, 7.709f, 9.262f, 7.838f, 9.496f)
                curveTo(7.967f, 9.731f, 8.023f, 9.998f, 8.0f, 10.265f)
                curveTo(7.545f, 10.124f, 7.075f, 10.041f, 6.6f, 10.016f)
                curveTo(5.768f, 9.948f, 4.936f, 10.147f, 4.225f, 10.584f)
                curveTo(3.83f, 10.826f, 3.514f, 11.18f, 3.318f, 11.6f)
                curveTo(3.122f, 12.021f, 3.055f, 12.489f, 3.124f, 12.948f)
                curveTo(3.192f, 13.407f, 3.395f, 13.835f, 3.706f, 14.179f)
                curveTo(4.016f, 14.524f, 4.422f, 14.769f, 4.871f, 14.884f)
                verticalLineTo(14.884f)
                close()
                moveTo(4.777f, 11.417f)
                curveTo(5.31f, 11.1f, 5.929f, 10.96f, 6.546f, 11.017f)
                curveTo(7.044f, 11.042f, 7.535f, 11.146f, 8.0f, 11.325f)
                verticalLineTo(12.789f)
                curveTo(7.653f, 13.201f, 7.209f, 13.521f, 6.708f, 13.718f)
                curveTo(6.206f, 13.915f, 5.664f, 13.984f, 5.129f, 13.918f)
                curveTo(4.865f, 13.853f, 4.627f, 13.71f, 4.445f, 13.509f)
                curveTo(4.263f, 13.307f, 4.146f, 13.055f, 4.108f, 12.786f)
                curveTo(4.07f, 12.517f, 4.114f, 12.243f, 4.233f, 11.999f)
                curveTo(4.352f, 11.755f, 4.542f, 11.552f, 4.777f, 11.417f)
                verticalLineTo(11.417f)
                close()
                moveTo(19.0f, 16.0f)
                verticalLineTo(16.5f)
                curveTo(19.0f, 16.898f, 18.842f, 17.279f, 18.561f, 17.561f)
                curveTo(18.279f, 17.842f, 17.898f, 18.0f, 17.5f, 18.0f)
                horizontalLineTo(2.5f)
                curveTo(2.102f, 18.0f, 1.721f, 17.842f, 1.439f, 17.561f)
                curveTo(1.158f, 17.279f, 1.0f, 16.898f, 1.0f, 16.5f)
                verticalLineTo(16.0f)
                curveTo(1.0f, 15.867f, 1.053f, 15.74f, 1.146f, 15.646f)
                curveTo(1.24f, 15.553f, 1.367f, 15.5f, 1.5f, 15.5f)
                curveTo(1.633f, 15.5f, 1.76f, 15.553f, 1.854f, 15.646f)
                curveTo(1.947f, 15.74f, 2.0f, 15.867f, 2.0f, 16.0f)
                verticalLineTo(16.5f)
                curveTo(2.0f, 16.633f, 2.053f, 16.76f, 2.146f, 16.854f)
                curveTo(2.24f, 16.947f, 2.367f, 17.0f, 2.5f, 17.0f)
                horizontalLineTo(17.5f)
                curveTo(17.633f, 17.0f, 17.76f, 16.947f, 17.854f, 16.854f)
                curveTo(17.947f, 16.76f, 18.0f, 16.633f, 18.0f, 16.5f)
                verticalLineTo(16.0f)
                curveTo(18.0f, 15.867f, 18.053f, 15.74f, 18.146f, 15.646f)
                curveTo(18.24f, 15.553f, 18.367f, 15.5f, 18.5f, 15.5f)
                curveTo(18.633f, 15.5f, 18.76f, 15.553f, 18.854f, 15.646f)
                curveTo(18.947f, 15.74f, 19.0f, 15.867f, 19.0f, 16.0f)
                close()
            }
        }
        .build()
        return _textWholeWord!!
    }

@Suppress("ObjectPropertyName")
private var _textWholeWord: ImageVector? = null

@Preview
@Composable
private fun TextWholeWordPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextWholeWord, contentDescription = null)
    }
}

