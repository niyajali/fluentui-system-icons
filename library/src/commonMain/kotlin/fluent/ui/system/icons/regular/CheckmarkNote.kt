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
 * CheckmarkNote Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used for toggle selection states or approvals.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_checkmark_note_20_regular.svg)
 * 
 * @return The [ImageVector] for the CheckmarkNote icon.
 */
public val FluentIcons.Regular.CheckmarkNote: ImageVector
    get() {
        if (_checkmarkNote != null) {
            return _checkmarkNote!!
        }
        _checkmarkNote = Builder(name = "CheckmarkNote", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.668f, 9.126f)
                curveTo(1.874f, 8.943f, 2.19f, 8.961f, 2.374f, 9.168f)
                lineTo(6.021f, 13.271f)
                lineTo(16.146f, 3.146f)
                curveTo(16.342f, 2.951f, 16.658f, 2.951f, 16.854f, 3.146f)
                curveTo(17.049f, 3.342f, 17.049f, 3.658f, 16.854f, 3.854f)
                lineTo(6.354f, 14.354f)
                curveTo(6.15f, 14.557f, 5.817f, 14.547f, 5.626f, 14.332f)
                lineTo(1.626f, 9.832f)
                curveTo(1.443f, 9.626f, 1.461f, 9.31f, 1.668f, 9.126f)
                close()
                moveTo(11.0f, 13.0f)
                curveTo(11.0f, 11.895f, 11.895f, 11.0f, 13.0f, 11.0f)
                horizontalLineTo(18.0f)
                curveTo(19.105f, 11.0f, 20.0f, 11.895f, 20.0f, 13.0f)
                verticalLineTo(17.0f)
                curveTo(20.0f, 18.105f, 19.105f, 19.0f, 18.0f, 19.0f)
                horizontalLineTo(13.0f)
                curveTo(11.895f, 19.0f, 11.0f, 18.105f, 11.0f, 17.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(17.5f, 16.0f)
                horizontalLineTo(13.5f)
                curveTo(13.224f, 16.0f, 13.0f, 16.224f, 13.0f, 16.5f)
                curveTo(13.0f, 16.776f, 13.224f, 17.0f, 13.5f, 17.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 17.0f, 18.0f, 16.776f, 18.0f, 16.5f)
                curveTo(18.0f, 16.224f, 17.776f, 16.0f, 17.5f, 16.0f)
                close()
                moveTo(13.5f, 13.0f)
                curveTo(13.224f, 13.0f, 13.0f, 13.224f, 13.0f, 13.5f)
                curveTo(13.0f, 13.776f, 13.224f, 14.0f, 13.5f, 14.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 14.0f, 18.0f, 13.776f, 18.0f, 13.5f)
                curveTo(18.0f, 13.224f, 17.776f, 13.0f, 17.5f, 13.0f)
                horizontalLineTo(13.5f)
                close()
            }
        }
        .build()
        return _checkmarkNote!!
    }

@Suppress("ObjectPropertyName")
private var _checkmarkNote: ImageVector? = null

@Preview
@Composable
private fun CheckmarkNotePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CheckmarkNote, contentDescription = "CheckmarkNote Icon")
    }
}

