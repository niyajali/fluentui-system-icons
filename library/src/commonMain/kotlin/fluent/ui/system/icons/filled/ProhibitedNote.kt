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
 * ProhibitedNote Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent blocked or unauthorized access for files, accounts, etc.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_prohibited_note_20_filled.svg)
 * 
 * @return The [ImageVector] for the ProhibitedNote icon.
 */
public val FluentIcons.Filled.ProhibitedNote: ImageVector
    get() {
        if (_prohibitedNote != null) {
            return _prohibitedNote!!
        }
        _prohibitedNote = Builder(name = "ProhibitedNote", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.998f, 10.17f)
                curveTo(17.999f, 10.113f, 18.0f, 10.057f, 18.0f, 10.0f)
                curveTo(18.0f, 5.582f, 14.418f, 2.0f, 10.0f, 2.0f)
                curveTo(5.582f, 2.0f, 2.0f, 5.582f, 2.0f, 10.0f)
                curveTo(2.0f, 14.133f, 5.134f, 17.534f, 9.156f, 17.956f)
                curveTo(9.055f, 17.656f, 9.0f, 17.334f, 9.0f, 17.0f)
                verticalLineTo(16.424f)
                curveTo(7.864f, 16.248f, 6.826f, 15.779f, 5.965f, 15.096f)
                lineTo(7.529f, 13.531f)
                lineTo(7.53f, 13.53f)
                lineTo(15.096f, 5.965f)
                curveTo(15.975f, 7.073f, 16.5f, 8.475f, 16.5f, 10.0f)
                horizontalLineTo(17.0f)
                curveTo(17.35f, 10.0f, 17.686f, 10.06f, 17.998f, 10.17f)
                close()
                moveTo(14.035f, 4.904f)
                lineTo(4.904f, 14.035f)
                curveTo(4.025f, 12.927f, 3.5f, 11.525f, 3.5f, 10.0f)
                curveTo(3.5f, 6.41f, 6.41f, 3.5f, 10.0f, 3.5f)
                curveTo(11.525f, 3.5f, 12.927f, 4.025f, 14.035f, 4.904f)
                close()
                moveTo(10.0f, 13.0f)
                curveTo(10.0f, 11.895f, 10.895f, 11.0f, 12.0f, 11.0f)
                horizontalLineTo(17.0f)
                curveTo(18.105f, 11.0f, 19.0f, 11.895f, 19.0f, 13.0f)
                verticalLineTo(17.0f)
                curveTo(19.0f, 18.105f, 18.105f, 19.0f, 17.0f, 19.0f)
                horizontalLineTo(12.0f)
                curveTo(10.895f, 19.0f, 10.0f, 18.105f, 10.0f, 17.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(16.5f, 16.0f)
                horizontalLineTo(12.5f)
                curveTo(12.224f, 16.0f, 12.0f, 16.224f, 12.0f, 16.5f)
                curveTo(12.0f, 16.776f, 12.224f, 17.0f, 12.5f, 17.0f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 17.0f, 17.0f, 16.776f, 17.0f, 16.5f)
                curveTo(17.0f, 16.224f, 16.776f, 16.0f, 16.5f, 16.0f)
                close()
                moveTo(12.5f, 13.0f)
                curveTo(12.224f, 13.0f, 12.0f, 13.224f, 12.0f, 13.5f)
                curveTo(12.0f, 13.776f, 12.224f, 14.0f, 12.5f, 14.0f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 14.0f, 17.0f, 13.776f, 17.0f, 13.5f)
                curveTo(17.0f, 13.224f, 16.776f, 13.0f, 16.5f, 13.0f)
                horizontalLineTo(12.5f)
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
        Image(imageVector = FluentIcons.Filled.ProhibitedNote, contentDescription = "ProhibitedNote Icon")
    }
}

