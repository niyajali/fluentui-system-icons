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
 * Thinking icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: thinking
 * - Source: ic_fluent_thinking_24_regular.svg
 * 
 * @return The [ImageVector] for the Thinking icon.
 */
public val FluentIcons.Regular.Thinking: ImageVector
    get() {
        if (_thinking != null) {
            return _thinking!!
        }
        _thinking = Builder(name = "Thinking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 18.0f)
                curveTo(5.105f, 18.0f, 6.0f, 18.895f, 6.0f, 20.0f)
                curveTo(6.0f, 21.105f, 5.105f, 22.0f, 4.0f, 22.0f)
                curveTo(2.895f, 22.0f, 2.0f, 21.105f, 2.0f, 20.0f)
                curveTo(2.0f, 18.895f, 2.895f, 18.0f, 4.0f, 18.0f)
                close()
                moveTo(4.0f, 19.5f)
                curveTo(3.724f, 19.5f, 3.5f, 19.724f, 3.5f, 20.0f)
                curveTo(3.5f, 20.276f, 3.724f, 20.5f, 4.0f, 20.5f)
                curveTo(4.276f, 20.5f, 4.5f, 20.276f, 4.5f, 20.0f)
                curveTo(4.5f, 19.724f, 4.276f, 19.5f, 4.0f, 19.5f)
                close()
                moveTo(9.5f, 15.0f)
                curveTo(10.881f, 15.0f, 12.0f, 16.119f, 12.0f, 17.5f)
                curveTo(12.0f, 18.881f, 10.881f, 20.0f, 9.5f, 20.0f)
                curveTo(8.119f, 20.0f, 7.0f, 18.881f, 7.0f, 17.5f)
                curveTo(7.0f, 16.119f, 8.119f, 15.0f, 9.5f, 15.0f)
                close()
                moveTo(9.5f, 16.5f)
                curveTo(8.948f, 16.5f, 8.5f, 16.948f, 8.5f, 17.5f)
                curveTo(8.5f, 18.052f, 8.948f, 18.5f, 9.5f, 18.5f)
                curveTo(10.052f, 18.5f, 10.5f, 18.052f, 10.5f, 17.5f)
                curveTo(10.5f, 16.948f, 10.052f, 16.5f, 9.5f, 16.5f)
                close()
                moveTo(11.823f, 2.0f)
                curveTo(14.483f, 2.0f, 16.707f, 3.923f, 17.154f, 6.471f)
                lineTo(17.235f, 6.471f)
                curveTo(19.315f, 6.471f, 21.0f, 8.156f, 21.0f, 10.235f)
                curveTo(21.0f, 12.314f, 19.315f, 14.0f, 17.235f, 14.0f)
                horizontalLineTo(6.412f)
                curveTo(4.333f, 14.0f, 2.647f, 12.314f, 2.647f, 10.235f)
                curveTo(2.647f, 8.156f, 4.333f, 6.471f, 6.412f, 6.471f)
                lineTo(6.493f, 6.471f)
                curveTo(6.94f, 3.923f, 9.164f, 2.0f, 11.823f, 2.0f)
                close()
                moveTo(11.829f, 3.498f)
                curveTo(9.733f, 3.498f, 8.009f, 5.143f, 7.906f, 7.226f)
                curveTo(7.888f, 7.595f, 7.583f, 7.885f, 7.214f, 7.885f)
                lineTo(6.515f, 7.885f)
                curveTo(5.239f, 7.885f, 4.204f, 8.918f, 4.204f, 10.193f)
                curveTo(4.204f, 11.469f, 5.239f, 12.502f, 6.515f, 12.502f)
                horizontalLineTo(17.143f)
                curveTo(18.42f, 12.502f, 19.454f, 11.469f, 19.454f, 10.193f)
                curveTo(19.454f, 8.918f, 18.42f, 7.885f, 17.143f, 7.885f)
                lineTo(16.445f, 7.885f)
                curveTo(16.075f, 7.885f, 15.771f, 7.595f, 15.752f, 7.226f)
                curveTo(15.65f, 5.143f, 13.925f, 3.498f, 11.829f, 3.498f)
                close()
            }
        }
        .build()
        return _thinking!!
    }

@Suppress("ObjectPropertyName")
private var _thinking: ImageVector? = null

@Preview
@Composable
private fun ThinkingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Thinking, contentDescription = null)
    }
}

