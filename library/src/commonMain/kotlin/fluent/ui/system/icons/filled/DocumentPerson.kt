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
 * DocumentPerson Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent shared file types and actions.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_document_person_20_filled.svg)
 * 
 * @return The [ImageVector] for the DocumentPerson icon.
 */
public val FluentIcons.Filled.DocumentPerson: ImageVector
    get() {
        if (_documentPerson != null) {
            return _documentPerson!!
        }
        _documentPerson = Builder(name = "DocumentPerson", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                verticalLineTo(6.5f)
                curveTo(10.0f, 7.328f, 10.672f, 8.0f, 11.5f, 8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.5f)
                curveTo(16.0f, 17.328f, 15.328f, 18.0f, 14.5f, 18.0f)
                horizontalLineTo(8.632f)
                curveTo(8.881f, 17.527f, 9.0f, 17.012f, 9.0f, 16.5f)
                curveTo(9.0f, 15.196f, 8.001f, 14.125f, 6.727f, 14.01f)
                curveTo(7.207f, 13.478f, 7.5f, 12.773f, 7.5f, 12.0f)
                curveTo(7.5f, 10.343f, 6.157f, 9.0f, 4.5f, 9.0f)
                curveTo(4.33f, 9.0f, 4.163f, 9.014f, 4.0f, 9.041f)
                verticalLineTo(3.5f)
                curveTo(4.0f, 2.672f, 4.672f, 2.0f, 5.5f, 2.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(11.0f, 2.25f)
                verticalLineTo(6.5f)
                curveTo(11.0f, 6.776f, 11.224f, 7.0f, 11.5f, 7.0f)
                horizontalLineTo(15.75f)
                lineTo(11.0f, 2.25f)
                close()
                moveTo(6.5f, 12.0f)
                curveTo(6.5f, 13.105f, 5.605f, 14.0f, 4.5f, 14.0f)
                curveTo(3.395f, 14.0f, 2.5f, 13.105f, 2.5f, 12.0f)
                curveTo(2.5f, 10.895f, 3.395f, 10.0f, 4.5f, 10.0f)
                curveTo(5.605f, 10.0f, 6.5f, 10.895f, 6.5f, 12.0f)
                close()
                moveTo(8.0f, 16.5f)
                curveTo(8.0f, 17.745f, 7.0f, 19.0f, 4.5f, 19.0f)
                curveTo(2.0f, 19.0f, 1.0f, 17.75f, 1.0f, 16.5f)
                curveTo(1.0f, 15.672f, 1.672f, 15.0f, 2.5f, 15.0f)
                horizontalLineTo(6.5f)
                curveTo(7.328f, 15.0f, 8.0f, 15.672f, 8.0f, 16.5f)
                close()
            }
        }
        .build()
        return _documentPerson!!
    }

@Suppress("ObjectPropertyName")
private var _documentPerson: ImageVector? = null

@Preview
@Composable
private fun DocumentPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentPerson, contentDescription = "DocumentPerson Icon")
    }
}

