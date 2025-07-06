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
 * DatabaseStack Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent multiple database.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_database_stack_16_regular.svg)
 * 
 * @return The [ImageVector] for the DatabaseStack icon.
 */
public val FluentIcons.Regular.DatabaseStack: ImageVector
    get() {
        if (_databaseStack != null) {
            return _databaseStack!!
        }
        _databaseStack = Builder(name = "DatabaseStack", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 1.0f)
                curveTo(5.149f, 1.0f, 3.0f, 2.075f, 3.0f, 3.5f)
                verticalLineTo(12.5f)
                curveTo(3.0f, 13.925f, 5.149f, 15.0f, 8.0f, 15.0f)
                curveTo(10.851f, 15.0f, 13.0f, 13.925f, 13.0f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(13.0f, 2.075f, 10.851f, 1.0f, 8.0f, 1.0f)
                close()
                moveTo(8.0f, 2.0f)
                curveTo(10.441f, 2.0f, 12.0f, 2.888f, 12.0f, 3.5f)
                curveTo(12.0f, 4.112f, 10.441f, 5.0f, 8.0f, 5.0f)
                curveTo(5.559f, 5.0f, 4.0f, 4.112f, 4.0f, 3.5f)
                curveTo(4.0f, 2.888f, 5.558f, 2.0f, 8.0f, 2.0f)
                close()
                moveTo(8.0f, 14.0f)
                curveTo(5.558f, 14.0f, 4.0f, 13.111f, 4.0f, 12.5f)
                verticalLineTo(9.537f)
                curveTo(4.897f, 10.13f, 6.328f, 10.5f, 8.0f, 10.5f)
                curveTo(9.672f, 10.5f, 11.103f, 10.13f, 12.0f, 9.537f)
                verticalLineTo(12.5f)
                curveTo(12.0f, 13.111f, 10.441f, 14.0f, 8.0f, 14.0f)
                close()
                moveTo(8.0f, 9.5f)
                curveTo(5.558f, 9.5f, 4.0f, 8.612f, 4.0f, 8.0f)
                verticalLineTo(5.021f)
                curveTo(5.214f, 5.719f, 6.601f, 6.058f, 8.0f, 6.0f)
                curveTo(9.399f, 6.058f, 10.786f, 5.719f, 12.0f, 5.021f)
                verticalLineTo(8.0f)
                curveTo(12.0f, 8.612f, 10.442f, 9.5f, 8.0f, 9.5f)
                close()
            }
        }
        .build()
        return _databaseStack!!
    }

@Suppress("ObjectPropertyName")
private var _databaseStack: ImageVector? = null

@Preview
@Composable
private fun DatabaseStackPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DatabaseStack, contentDescription = "DatabaseStack Icon")
    }
}

