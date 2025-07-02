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

package fluent.ui.system.icons.filled

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
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: text, whole, word
 * - Source: ic_fluent_text_whole_word_20_filled.svg
 * 
 * @return The [ImageVector] for the TextWholeWord icon.
 */
public val FluentIcons.Filled.TextWholeWord: ImageVector
    get() {
        if (_textWholeWord != null) {
            return _textWholeWord!!
        }
        _textWholeWord = Builder(name = "TextWholeWord", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 15.75f)
                verticalLineTo(16.25f)
                curveTo(19.0f, 16.714f, 18.815f, 17.159f, 18.487f, 17.487f)
                curveTo(18.159f, 17.815f, 17.714f, 18.0f, 17.25f, 18.0f)
                horizontalLineTo(2.75f)
                curveTo(2.286f, 18.0f, 1.841f, 17.815f, 1.513f, 17.487f)
                curveTo(1.185f, 17.159f, 1.001f, 16.714f, 1.0f, 16.25f)
                verticalLineTo(15.75f)
                curveTo(1.0f, 15.551f, 1.079f, 15.36f, 1.22f, 15.22f)
                curveTo(1.36f, 15.079f, 1.551f, 15.0f, 1.75f, 15.0f)
                curveTo(1.949f, 15.0f, 2.14f, 15.079f, 2.28f, 15.22f)
                curveTo(2.421f, 15.36f, 2.5f, 15.551f, 2.5f, 15.75f)
                verticalLineTo(16.25f)
                curveTo(2.5f, 16.316f, 2.526f, 16.38f, 2.573f, 16.427f)
                curveTo(2.62f, 16.474f, 2.684f, 16.5f, 2.75f, 16.5f)
                horizontalLineTo(17.25f)
                curveTo(17.316f, 16.5f, 17.38f, 16.474f, 17.427f, 16.427f)
                curveTo(17.474f, 16.38f, 17.5f, 16.316f, 17.5f, 16.25f)
                verticalLineTo(15.75f)
                curveTo(17.5f, 15.551f, 17.579f, 15.36f, 17.72f, 15.22f)
                curveTo(17.86f, 15.079f, 18.051f, 15.0f, 18.25f, 15.0f)
                curveTo(18.449f, 15.0f, 18.64f, 15.079f, 18.78f, 15.22f)
                curveTo(18.921f, 15.36f, 19.0f, 15.551f, 19.0f, 15.75f)
                close()
                moveTo(3.833f, 10.376f)
                curveTo(4.589f, 9.908f, 5.474f, 9.695f, 6.36f, 9.766f)
                curveTo(6.731f, 9.786f, 7.099f, 9.84f, 7.46f, 9.928f)
                curveTo(7.44f, 9.766f, 7.379f, 9.611f, 7.283f, 9.479f)
                curveTo(7.186f, 9.346f, 7.058f, 9.24f, 6.91f, 9.171f)
                curveTo(6.515f, 8.991f, 6.082f, 8.91f, 5.649f, 8.937f)
                curveTo(5.281f, 8.944f, 4.918f, 9.024f, 4.581f, 9.171f)
                curveTo(4.493f, 9.215f, 4.397f, 9.241f, 4.299f, 9.248f)
                curveTo(4.2f, 9.255f, 4.102f, 9.243f, 4.008f, 9.212f)
                curveTo(3.915f, 9.181f, 3.828f, 9.131f, 3.754f, 9.067f)
                curveTo(3.68f, 9.002f, 3.619f, 8.924f, 3.575f, 8.835f)
                curveTo(3.53f, 8.747f, 3.504f, 8.651f, 3.497f, 8.553f)
                curveTo(3.49f, 8.455f, 3.503f, 8.356f, 3.534f, 8.263f)
                curveTo(3.565f, 8.169f, 3.614f, 8.083f, 3.679f, 8.008f)
                curveTo(3.743f, 7.934f, 3.822f, 7.873f, 3.91f, 7.829f)
                curveTo(4.44f, 7.584f, 5.016f, 7.451f, 5.6f, 7.438f)
                curveTo(6.285f, 7.402f, 6.969f, 7.536f, 7.59f, 7.829f)
                curveTo(8.058f, 8.079f, 8.442f, 8.462f, 8.693f, 8.93f)
                curveTo(8.944f, 9.397f, 9.051f, 9.929f, 9.0f, 10.457f)
                verticalLineTo(14.5f)
                curveTo(9.007f, 14.699f, 8.936f, 14.893f, 8.8f, 15.038f)
                curveTo(8.665f, 15.184f, 8.477f, 15.271f, 8.278f, 15.278f)
                curveTo(8.079f, 15.285f, 7.885f, 15.214f, 7.739f, 15.078f)
                curveTo(7.594f, 14.943f, 7.507f, 14.755f, 7.5f, 14.556f)
                curveTo(7.075f, 14.85f, 6.594f, 15.052f, 6.087f, 15.15f)
                curveTo(5.58f, 15.248f, 5.059f, 15.239f, 4.555f, 15.125f)
                curveTo(4.059f, 14.997f, 3.612f, 14.727f, 3.269f, 14.347f)
                curveTo(2.926f, 13.967f, 2.702f, 13.495f, 2.625f, 12.989f)
                curveTo(2.548f, 12.483f, 2.622f, 11.966f, 2.836f, 11.501f)
                curveTo(3.051f, 11.036f, 3.398f, 10.645f, 3.833f, 10.376f)
                close()
                moveTo(4.944f, 13.676f)
                curveTo(5.419f, 13.731f, 5.901f, 13.669f, 6.347f, 13.494f)
                curveTo(6.792f, 13.32f, 7.188f, 13.039f, 7.5f, 12.676f)
                verticalLineTo(11.5f)
                curveTo(7.107f, 11.366f, 6.698f, 11.287f, 6.284f, 11.265f)
                curveTo(5.72f, 11.211f, 5.153f, 11.337f, 4.665f, 11.626f)
                curveTo(4.47f, 11.735f, 4.313f, 11.9f, 4.213f, 12.1f)
                curveTo(4.114f, 12.3f, 4.077f, 12.525f, 4.107f, 12.746f)
                curveTo(4.137f, 12.967f, 4.233f, 13.174f, 4.382f, 13.34f)
                curveTo(4.532f, 13.506f, 4.727f, 13.623f, 4.944f, 13.676f)
                close()
                moveTo(11.0f, 14.5f)
                verticalLineTo(4.0f)
                curveTo(11.0f, 3.801f, 11.079f, 3.61f, 11.22f, 3.47f)
                curveTo(11.36f, 3.329f, 11.551f, 3.25f, 11.75f, 3.25f)
                curveTo(11.949f, 3.25f, 12.14f, 3.329f, 12.28f, 3.47f)
                curveTo(12.421f, 3.61f, 12.5f, 3.801f, 12.5f, 4.0f)
                verticalLineTo(8.657f)
                curveTo(12.987f, 8.237f, 13.607f, 8.004f, 14.25f, 8.0f)
                curveTo(15.11f, 8.071f, 15.907f, 8.479f, 16.469f, 9.134f)
                curveTo(17.03f, 9.789f, 17.311f, 10.639f, 17.25f, 11.5f)
                curveTo(17.311f, 12.361f, 17.03f, 13.211f, 16.469f, 13.866f)
                curveTo(15.907f, 14.521f, 15.11f, 14.929f, 14.25f, 15.0f)
                curveTo(13.607f, 14.995f, 12.987f, 14.762f, 12.5f, 14.343f)
                verticalLineTo(14.5f)
                curveTo(12.5f, 14.699f, 12.421f, 14.89f, 12.28f, 15.03f)
                curveTo(12.14f, 15.171f, 11.949f, 15.25f, 11.75f, 15.25f)
                curveTo(11.551f, 15.25f, 11.36f, 15.171f, 11.22f, 15.03f)
                curveTo(11.079f, 14.89f, 11.0f, 14.699f, 11.0f, 14.5f)
                close()
                moveTo(12.75f, 11.5f)
                curveTo(12.692f, 11.963f, 12.816f, 12.43f, 13.096f, 12.803f)
                curveTo(13.376f, 13.176f, 13.79f, 13.426f, 14.25f, 13.5f)
                curveTo(14.71f, 13.426f, 15.124f, 13.176f, 15.404f, 12.803f)
                curveTo(15.684f, 12.43f, 15.808f, 11.963f, 15.75f, 11.5f)
                curveTo(15.808f, 11.037f, 15.684f, 10.57f, 15.404f, 10.197f)
                curveTo(15.124f, 9.824f, 14.71f, 9.574f, 14.25f, 9.5f)
                curveTo(13.79f, 9.574f, 13.376f, 9.824f, 13.096f, 10.197f)
                curveTo(12.816f, 10.57f, 12.692f, 11.037f, 12.75f, 11.5f)
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
        Image(imageVector = FluentIcons.Filled.TextWholeWord, contentDescription = null)
    }
}

