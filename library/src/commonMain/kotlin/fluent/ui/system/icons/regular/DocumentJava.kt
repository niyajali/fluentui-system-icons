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
 * DocumentJava icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: document, java
 * - Source: ic_fluent_document_java_20_regular.svg
 * 
 * @return The [ImageVector] for the DocumentJava icon.
 */
public val FluentIcons.Regular.DocumentJava: ImageVector
    get() {
        if (_documentJava != null) {
            return _documentJava!!
        }
        _documentJava = Builder(name = "DocumentJava", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                curveTo(4.895f, 2.0f, 4.0f, 2.895f, 4.0f, 4.0f)
                verticalLineTo(11.085f)
                curveTo(4.583f, 11.291f, 5.0f, 11.847f, 5.0f, 12.5f)
                verticalLineTo(4.0f)
                curveTo(5.0f, 3.448f, 5.448f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.5f)
                curveTo(10.0f, 7.328f, 10.672f, 8.0f, 11.5f, 8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.671f)
                curveTo(15.228f, 11.327f, 15.59f, 11.09f, 16.0f, 11.021f)
                verticalLineTo(7.414f)
                curveTo(16.0f, 7.016f, 15.842f, 6.635f, 15.561f, 6.354f)
                lineTo(11.646f, 2.439f)
                curveTo(11.365f, 2.158f, 10.984f, 2.0f, 10.586f, 2.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(14.793f, 7.0f)
                horizontalLineTo(11.5f)
                curveTo(11.224f, 7.0f, 11.0f, 6.776f, 11.0f, 6.5f)
                verticalLineTo(3.207f)
                lineTo(14.793f, 7.0f)
                close()
                moveTo(11.75f, 18.0f)
                curveTo(11.962f, 18.0f, 12.152f, 17.866f, 12.222f, 17.665f)
                lineTo(13.972f, 12.665f)
                curveTo(14.063f, 12.405f, 13.926f, 12.119f, 13.665f, 12.028f)
                curveTo(13.405f, 11.937f, 13.119f, 12.074f, 13.028f, 12.335f)
                lineTo(11.75f, 15.987f)
                lineTo(10.472f, 12.335f)
                curveTo(10.381f, 12.074f, 10.095f, 11.937f, 9.835f, 12.028f)
                curveTo(9.574f, 12.119f, 9.437f, 12.405f, 9.528f, 12.665f)
                lineTo(11.278f, 17.665f)
                curveTo(11.348f, 17.866f, 11.538f, 18.0f, 11.75f, 18.0f)
                close()
                moveTo(16.722f, 12.335f)
                curveTo(16.652f, 12.134f, 16.462f, 12.0f, 16.25f, 12.0f)
                curveTo(16.038f, 12.0f, 15.848f, 12.134f, 15.778f, 12.335f)
                lineTo(14.028f, 17.335f)
                curveTo(13.937f, 17.596f, 14.074f, 17.881f, 14.335f, 17.972f)
                curveTo(14.595f, 18.063f, 14.881f, 17.926f, 14.972f, 17.665f)
                lineTo(15.205f, 17.0f)
                horizontalLineTo(17.295f)
                lineTo(17.528f, 17.665f)
                curveTo(17.619f, 17.926f, 17.904f, 18.063f, 18.165f, 17.972f)
                curveTo(18.426f, 17.881f, 18.563f, 17.596f, 18.472f, 17.335f)
                lineTo(16.722f, 12.335f)
                close()
                moveTo(16.945f, 16.0f)
                horizontalLineTo(15.555f)
                lineTo(16.25f, 14.014f)
                lineTo(16.945f, 16.0f)
                close()
                moveTo(3.5f, 12.0f)
                curveTo(3.776f, 12.0f, 4.0f, 12.224f, 4.0f, 12.5f)
                verticalLineTo(16.5f)
                curveTo(4.0f, 17.329f, 3.328f, 18.0f, 2.5f, 18.0f)
                curveTo(1.672f, 18.0f, 1.0f, 17.329f, 1.0f, 16.5f)
                verticalLineTo(16.0f)
                curveTo(1.0f, 15.724f, 1.224f, 15.5f, 1.5f, 15.5f)
                curveTo(1.776f, 15.5f, 2.0f, 15.724f, 2.0f, 16.0f)
                verticalLineTo(16.5f)
                curveTo(2.0f, 16.776f, 2.224f, 17.0f, 2.5f, 17.0f)
                curveTo(2.776f, 17.0f, 3.0f, 16.776f, 3.0f, 16.5f)
                verticalLineTo(12.5f)
                curveTo(3.0f, 12.224f, 3.224f, 12.0f, 3.5f, 12.0f)
                close()
                moveTo(7.25f, 12.0f)
                curveTo(7.462f, 12.0f, 7.652f, 12.134f, 7.722f, 12.335f)
                lineTo(9.472f, 17.335f)
                curveTo(9.563f, 17.596f, 9.426f, 17.881f, 9.165f, 17.972f)
                curveTo(8.905f, 18.063f, 8.619f, 17.926f, 8.528f, 17.665f)
                lineTo(8.295f, 17.0f)
                horizontalLineTo(6.205f)
                lineTo(5.972f, 17.665f)
                curveTo(5.881f, 17.926f, 5.595f, 18.063f, 5.335f, 17.972f)
                curveTo(5.074f, 17.881f, 4.937f, 17.596f, 5.028f, 17.335f)
                lineTo(6.778f, 12.335f)
                curveTo(6.848f, 12.134f, 7.038f, 12.0f, 7.25f, 12.0f)
                close()
                moveTo(7.25f, 14.014f)
                lineTo(6.555f, 16.0f)
                horizontalLineTo(7.945f)
                lineTo(7.25f, 14.014f)
                close()
            }
        }
        .build()
        return _documentJava!!
    }

@Suppress("ObjectPropertyName")
private var _documentJava: ImageVector? = null

@Preview
@Composable
private fun DocumentJavaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentJava, contentDescription = null)
    }
}

