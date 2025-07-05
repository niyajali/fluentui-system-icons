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
 * ProhibitedNote Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent blocked or unauthorized access for files, accounts, etc.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_prohibited_note_20_regular.svg)
 * 
 * @return The [ImageVector] for the ProhibitedNote icon.
 */
public val FluentIcons.Regular.ProhibitedNote: ImageVector
    get() {
        if (_prohibitedNote != null) {
            return _prohibitedNote!!
        }
        _prohibitedNote = Builder(name = "ProhibitedNote", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 10.0f)
                curveTo(18.0f, 10.057f, 17.999f, 10.113f, 17.998f, 10.17f)
                curveTo(17.686f, 10.06f, 17.35f, 10.0f, 17.0f, 10.0f)
                curveTo(17.0f, 8.247f, 16.356f, 6.644f, 15.291f, 5.416f)
                lineTo(5.416f, 15.291f)
                curveTo(6.407f, 16.149f, 7.64f, 16.735f, 9.0f, 16.929f)
                verticalLineTo(17.0f)
                curveTo(9.0f, 17.334f, 9.055f, 17.656f, 9.156f, 17.956f)
                curveTo(5.134f, 17.534f, 2.0f, 14.133f, 2.0f, 10.0f)
                curveTo(2.0f, 5.582f, 5.582f, 2.0f, 10.0f, 2.0f)
                curveTo(14.418f, 2.0f, 18.0f, 5.582f, 18.0f, 10.0f)
                close()
                moveTo(4.709f, 14.584f)
                lineTo(14.584f, 4.709f)
                curveTo(13.356f, 3.644f, 11.753f, 3.0f, 10.0f, 3.0f)
                curveTo(6.134f, 3.0f, 3.0f, 6.134f, 3.0f, 10.0f)
                curveTo(3.0f, 11.753f, 3.644f, 13.356f, 4.709f, 14.584f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(10.895f, 11.0f, 10.0f, 11.895f, 10.0f, 13.0f)
                verticalLineTo(17.0f)
                curveTo(10.0f, 18.105f, 10.895f, 19.0f, 12.0f, 19.0f)
                horizontalLineTo(17.0f)
                curveTo(18.105f, 19.0f, 19.0f, 18.105f, 19.0f, 17.0f)
                verticalLineTo(13.0f)
                curveTo(19.0f, 11.895f, 18.105f, 11.0f, 17.0f, 11.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(12.5f, 16.0f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 16.0f, 17.0f, 16.224f, 17.0f, 16.5f)
                curveTo(17.0f, 16.776f, 16.776f, 17.0f, 16.5f, 17.0f)
                horizontalLineTo(12.5f)
                curveTo(12.224f, 17.0f, 12.0f, 16.776f, 12.0f, 16.5f)
                curveTo(12.0f, 16.224f, 12.224f, 16.0f, 12.5f, 16.0f)
                close()
                moveTo(12.0f, 13.5f)
                curveTo(12.0f, 13.224f, 12.224f, 13.0f, 12.5f, 13.0f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 13.0f, 17.0f, 13.224f, 17.0f, 13.5f)
                curveTo(17.0f, 13.776f, 16.776f, 14.0f, 16.5f, 14.0f)
                horizontalLineTo(12.5f)
                curveTo(12.224f, 14.0f, 12.0f, 13.776f, 12.0f, 13.5f)
                close()
            }
        }
        .build()
        return _prohibitedNote!!
    }

@Suppress("ObjectPropertyName")
private var _prohibitedNote: ImageVector? = null

@Preview
@Composable
private fun ProhibitedNotePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ProhibitedNote, contentDescription = "ProhibitedNote Icon")
    }
}

