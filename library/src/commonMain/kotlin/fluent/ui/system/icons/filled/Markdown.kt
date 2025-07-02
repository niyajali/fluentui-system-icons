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
 * Markdown icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: markdown
 * - Source: ic_fluent_markdown_20_filled.svg
 * 
 * @return The [ImageVector] for the Markdown icon.
 */
public val FluentIcons.Filled.Markdown: ImageVector
    get() {
        if (_markdown != null) {
            return _markdown!!
        }
        _markdown = Builder(name = "Markdown", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.491f, 4.046f)
                curveTo(2.786f, 3.938f, 3.118f, 4.025f, 3.321f, 4.264f)
                lineTo(7.0f, 8.592f)
                lineTo(10.679f, 4.264f)
                curveTo(10.882f, 4.025f, 11.214f, 3.938f, 11.509f, 4.046f)
                curveTo(11.804f, 4.155f, 12.0f, 4.436f, 12.0f, 4.75f)
                verticalLineTo(14.25f)
                curveTo(12.0f, 14.664f, 11.664f, 15.0f, 11.25f, 15.0f)
                curveTo(10.836f, 15.0f, 10.5f, 14.664f, 10.5f, 14.25f)
                verticalLineTo(6.79f)
                lineTo(7.571f, 10.236f)
                curveTo(7.429f, 10.403f, 7.22f, 10.5f, 7.0f, 10.5f)
                curveTo(6.78f, 10.5f, 6.571f, 10.403f, 6.429f, 10.236f)
                lineTo(3.5f, 6.79f)
                verticalLineTo(14.25f)
                curveTo(3.5f, 14.664f, 3.164f, 15.0f, 2.75f, 15.0f)
                curveTo(2.336f, 15.0f, 2.0f, 14.664f, 2.0f, 14.25f)
                verticalLineTo(4.75f)
                curveTo(2.0f, 4.436f, 2.196f, 4.155f, 2.491f, 4.046f)
                close()
                moveTo(13.22f, 11.72f)
                curveTo(13.513f, 11.427f, 13.987f, 11.427f, 14.28f, 11.72f)
                lineTo(15.0f, 12.439f)
                verticalLineTo(4.75f)
                curveTo(15.0f, 4.336f, 15.336f, 4.0f, 15.75f, 4.0f)
                curveTo(16.164f, 4.0f, 16.5f, 4.336f, 16.5f, 4.75f)
                verticalLineTo(12.439f)
                lineTo(17.22f, 11.72f)
                curveTo(17.513f, 11.427f, 17.987f, 11.427f, 18.28f, 11.72f)
                curveTo(18.573f, 12.013f, 18.573f, 12.488f, 18.28f, 12.78f)
                lineTo(16.28f, 14.78f)
                curveTo(15.987f, 15.073f, 15.513f, 15.073f, 15.22f, 14.78f)
                lineTo(13.22f, 12.78f)
                curveTo(12.927f, 12.488f, 12.927f, 12.013f, 13.22f, 11.72f)
                close()
            }
        }
        .build()
        return _markdown!!
    }

@Suppress("ObjectPropertyName")
private var _markdown: ImageVector? = null

@Preview
@Composable
private fun MarkdownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Markdown, contentDescription = null)
    }
}

