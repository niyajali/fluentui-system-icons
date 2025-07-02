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
 * ArrowEject icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: arrow, eject
 * - Source: ic_fluent_arrow_eject_20_regular.svg
 * 
 * @return The [ImageVector] for the ArrowEject icon.
 */
public val FluentIcons.Regular.ArrowEject: ImageVector
    get() {
        if (_arrowEject != null) {
            return _arrowEject!!
        }
        _arrowEject = Builder(name = "ArrowEject", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.598f, 5.2f)
                curveTo(9.798f, 4.933f, 10.198f, 4.933f, 10.399f, 5.2f)
                lineTo(14.897f, 11.201f)
                curveTo(15.144f, 11.531f, 14.909f, 12.001f, 14.497f, 12.001f)
                horizontalLineTo(5.503f)
                curveTo(5.091f, 12.001f, 4.856f, 11.531f, 5.103f, 11.201f)
                lineTo(9.598f, 5.2f)
                close()
                moveTo(11.199f, 4.6f)
                curveTo(10.599f, 3.8f, 9.398f, 3.8f, 8.798f, 4.601f)
                lineTo(4.302f, 10.602f)
                curveTo(3.561f, 11.591f, 4.267f, 13.001f, 5.503f, 13.001f)
                horizontalLineTo(14.497f)
                curveTo(15.733f, 13.001f, 16.438f, 11.59f, 15.697f, 10.602f)
                lineTo(11.199f, 4.6f)
                close()
                moveTo(4.0f, 15.0f)
                curveTo(3.724f, 15.0f, 3.5f, 15.224f, 3.5f, 15.5f)
                curveTo(3.5f, 15.776f, 3.724f, 16.0f, 4.0f, 16.0f)
                horizontalLineTo(16.0f)
                curveTo(16.276f, 16.0f, 16.5f, 15.776f, 16.5f, 15.5f)
                curveTo(16.5f, 15.224f, 16.276f, 15.0f, 16.0f, 15.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _arrowEject!!
    }

@Suppress("ObjectPropertyName")
private var _arrowEject: ImageVector? = null

@Preview
@Composable
private fun ArrowEjectPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowEject, contentDescription = null)
    }
}

