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
 * ClipboardTaskList icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: clipboard, task, list
 * - Source: ic_fluent_clipboard_task_list_16_filled.svg
 * 
 * @return The [ImageVector] for the ClipboardTaskList icon.
 */
public val FluentIcons.Filled.ClipboardTaskList: ImageVector
    get() {
        if (_clipboardTaskList != null) {
            return _clipboardTaskList!!
        }
        _clipboardTaskList = Builder(name = "ClipboardTaskList", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.5f, 2.0f)
                horizontalLineTo(10.915f)
                curveTo(10.709f, 1.417f, 10.153f, 1.0f, 9.5f, 1.0f)
                horizontalLineTo(6.5f)
                curveTo(5.847f, 1.0f, 5.291f, 1.417f, 5.085f, 2.0f)
                horizontalLineTo(4.5f)
                curveTo(3.672f, 2.0f, 3.0f, 2.672f, 3.0f, 3.5f)
                verticalLineTo(13.5f)
                curveTo(3.0f, 14.328f, 3.672f, 15.0f, 4.5f, 15.0f)
                horizontalLineTo(11.5f)
                curveTo(12.328f, 15.0f, 13.0f, 14.328f, 13.0f, 13.5f)
                verticalLineTo(3.5f)
                curveTo(13.0f, 2.672f, 12.328f, 2.0f, 11.5f, 2.0f)
                close()
                moveTo(6.5f, 2.0f)
                horizontalLineTo(9.5f)
                curveTo(9.776f, 2.0f, 10.0f, 2.224f, 10.0f, 2.5f)
                curveTo(10.0f, 2.776f, 9.776f, 3.0f, 9.5f, 3.0f)
                horizontalLineTo(6.5f)
                curveTo(6.224f, 3.0f, 6.0f, 2.776f, 6.0f, 2.5f)
                curveTo(6.0f, 2.224f, 6.224f, 2.0f, 6.5f, 2.0f)
                close()
                moveTo(7.352f, 10.354f)
                lineTo(5.852f, 11.854f)
                curveTo(5.754f, 11.952f, 5.627f, 12.0f, 5.499f, 12.0f)
                curveTo(5.371f, 12.0f, 5.244f, 11.951f, 5.146f, 11.854f)
                lineTo(4.646f, 11.354f)
                curveTo(4.451f, 11.159f, 4.451f, 10.842f, 4.646f, 10.647f)
                curveTo(4.841f, 10.452f, 5.158f, 10.452f, 5.353f, 10.647f)
                lineTo(5.499f, 10.793f)
                lineTo(6.645f, 9.647f)
                curveTo(6.84f, 9.452f, 7.157f, 9.452f, 7.352f, 9.647f)
                curveTo(7.547f, 9.842f, 7.547f, 10.159f, 7.352f, 10.354f)
                close()
                moveTo(7.352f, 6.354f)
                lineTo(5.852f, 7.854f)
                curveTo(5.754f, 7.952f, 5.627f, 8.0f, 5.499f, 8.0f)
                curveTo(5.371f, 8.0f, 5.244f, 7.951f, 5.146f, 7.854f)
                lineTo(4.646f, 7.354f)
                curveTo(4.451f, 7.159f, 4.451f, 6.842f, 4.646f, 6.647f)
                curveTo(4.841f, 6.452f, 5.158f, 6.452f, 5.353f, 6.647f)
                lineTo(5.499f, 6.793f)
                lineTo(6.645f, 5.647f)
                curveTo(6.84f, 5.452f, 7.157f, 5.452f, 7.352f, 5.647f)
                curveTo(7.547f, 5.842f, 7.547f, 6.159f, 7.352f, 6.354f)
                close()
                moveTo(10.5f, 11.0f)
                horizontalLineTo(9.0f)
                curveTo(8.724f, 11.0f, 8.5f, 10.776f, 8.5f, 10.5f)
                curveTo(8.5f, 10.224f, 8.724f, 10.0f, 9.0f, 10.0f)
                horizontalLineTo(10.5f)
                curveTo(10.776f, 10.0f, 11.0f, 10.224f, 11.0f, 10.5f)
                curveTo(11.0f, 10.776f, 10.776f, 11.0f, 10.5f, 11.0f)
                close()
                moveTo(10.5f, 7.0f)
                horizontalLineTo(9.0f)
                curveTo(8.724f, 7.0f, 8.5f, 6.776f, 8.5f, 6.5f)
                curveTo(8.5f, 6.224f, 8.724f, 6.0f, 9.0f, 6.0f)
                horizontalLineTo(10.5f)
                curveTo(10.776f, 6.0f, 11.0f, 6.224f, 11.0f, 6.5f)
                curveTo(11.0f, 6.776f, 10.776f, 7.0f, 10.5f, 7.0f)
                close()
            }
        }
        .build()
        return _clipboardTaskList!!
    }

@Suppress("ObjectPropertyName")
private var _clipboardTaskList: ImageVector? = null

@Preview
@Composable
private fun ClipboardTaskListPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ClipboardTaskList, contentDescription = null)
    }
}

