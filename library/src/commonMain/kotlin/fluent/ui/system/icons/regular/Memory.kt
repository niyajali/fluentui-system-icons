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
 * Memory icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: memory
 * - Source: ic_fluent_memory_16_regular.svg
 * 
 * @return The [ImageVector] for the Memory icon.
 */
public val FluentIcons.Regular.Memory: ImageVector
    get() {
        if (_memory != null) {
            return _memory!!
        }
        _memory = Builder(name = "Memory", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.414f, 4.586f)
                curveTo(14.039f, 4.211f, 13.53f, 4.0f, 13.0f, 4.0f)
                verticalLineTo(2.5f)
                curveTo(13.0f, 2.367f, 12.947f, 2.24f, 12.854f, 2.146f)
                curveTo(12.76f, 2.053f, 12.633f, 2.0f, 12.5f, 2.0f)
                curveTo(12.367f, 2.0f, 12.24f, 2.053f, 12.146f, 2.146f)
                curveTo(12.053f, 2.24f, 12.0f, 2.367f, 12.0f, 2.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(2.5f)
                curveTo(10.0f, 2.367f, 9.947f, 2.24f, 9.854f, 2.146f)
                curveTo(9.76f, 2.053f, 9.633f, 2.0f, 9.5f, 2.0f)
                curveTo(9.367f, 2.0f, 9.24f, 2.053f, 9.146f, 2.146f)
                curveTo(9.053f, 2.24f, 9.0f, 2.367f, 9.0f, 2.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.5f)
                curveTo(7.0f, 2.367f, 6.947f, 2.24f, 6.854f, 2.146f)
                curveTo(6.76f, 2.053f, 6.633f, 2.0f, 6.5f, 2.0f)
                curveTo(6.367f, 2.0f, 6.24f, 2.053f, 6.146f, 2.146f)
                curveTo(6.053f, 2.24f, 6.0f, 2.367f, 6.0f, 2.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(2.5f)
                curveTo(4.0f, 2.367f, 3.947f, 2.24f, 3.854f, 2.146f)
                curveTo(3.76f, 2.053f, 3.633f, 2.0f, 3.5f, 2.0f)
                curveTo(3.367f, 2.0f, 3.24f, 2.053f, 3.146f, 2.146f)
                curveTo(3.053f, 2.24f, 3.0f, 2.367f, 3.0f, 2.5f)
                verticalLineTo(4.0f)
                curveTo(2.47f, 4.0f, 1.961f, 4.211f, 1.586f, 4.586f)
                curveTo(1.211f, 4.961f, 1.0f, 5.47f, 1.0f, 6.0f)
                verticalLineTo(10.0f)
                curveTo(1.0f, 10.53f, 1.211f, 11.039f, 1.586f, 11.414f)
                curveTo(1.961f, 11.789f, 2.47f, 12.0f, 3.0f, 12.0f)
                verticalLineTo(13.5f)
                curveTo(3.0f, 13.633f, 3.053f, 13.76f, 3.146f, 13.854f)
                curveTo(3.24f, 13.947f, 3.367f, 14.0f, 3.5f, 14.0f)
                curveTo(3.633f, 14.0f, 3.76f, 13.947f, 3.854f, 13.854f)
                curveTo(3.947f, 13.76f, 4.0f, 13.633f, 4.0f, 13.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.5f)
                curveTo(6.0f, 13.633f, 6.053f, 13.76f, 6.146f, 13.854f)
                curveTo(6.24f, 13.947f, 6.367f, 14.0f, 6.5f, 14.0f)
                curveTo(6.633f, 14.0f, 6.76f, 13.947f, 6.854f, 13.854f)
                curveTo(6.947f, 13.76f, 7.0f, 13.633f, 7.0f, 13.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.5f)
                curveTo(9.0f, 13.633f, 9.053f, 13.76f, 9.146f, 13.854f)
                curveTo(9.24f, 13.947f, 9.367f, 14.0f, 9.5f, 14.0f)
                curveTo(9.633f, 14.0f, 9.76f, 13.947f, 9.854f, 13.854f)
                curveTo(9.947f, 13.76f, 10.0f, 13.633f, 10.0f, 13.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.5f)
                curveTo(12.0f, 13.633f, 12.053f, 13.76f, 12.146f, 13.854f)
                curveTo(12.24f, 13.947f, 12.367f, 14.0f, 12.5f, 14.0f)
                curveTo(12.633f, 14.0f, 12.76f, 13.947f, 12.854f, 13.854f)
                curveTo(12.947f, 13.76f, 13.0f, 13.633f, 13.0f, 13.5f)
                verticalLineTo(12.0f)
                curveTo(13.53f, 12.0f, 14.039f, 11.789f, 14.414f, 11.414f)
                curveTo(14.789f, 11.039f, 15.0f, 10.53f, 15.0f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(15.0f, 5.47f, 14.789f, 4.961f, 14.414f, 4.586f)
                close()
                moveTo(14.0f, 10.0f)
                curveTo(14.0f, 10.265f, 13.895f, 10.52f, 13.707f, 10.707f)
                curveTo(13.52f, 10.895f, 13.265f, 11.0f, 13.0f, 11.0f)
                horizontalLineTo(3.0f)
                curveTo(2.735f, 11.0f, 2.48f, 10.895f, 2.293f, 10.707f)
                curveTo(2.105f, 10.52f, 2.0f, 10.265f, 2.0f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 5.735f, 2.105f, 5.48f, 2.293f, 5.293f)
                curveTo(2.48f, 5.105f, 2.735f, 5.0f, 3.0f, 5.0f)
                horizontalLineTo(13.0f)
                curveTo(13.265f, 5.0f, 13.52f, 5.105f, 13.707f, 5.293f)
                curveTo(13.895f, 5.48f, 14.0f, 5.735f, 14.0f, 6.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(12.5f, 6.0f)
                horizontalLineTo(3.5f)
                curveTo(3.367f, 6.0f, 3.24f, 6.053f, 3.146f, 6.146f)
                curveTo(3.053f, 6.24f, 3.0f, 6.367f, 3.0f, 6.5f)
                verticalLineTo(9.5f)
                curveTo(3.0f, 9.633f, 3.053f, 9.76f, 3.146f, 9.854f)
                curveTo(3.24f, 9.947f, 3.367f, 10.0f, 3.5f, 10.0f)
                horizontalLineTo(12.5f)
                curveTo(12.633f, 10.0f, 12.76f, 9.947f, 12.854f, 9.854f)
                curveTo(12.947f, 9.76f, 13.0f, 9.633f, 13.0f, 9.5f)
                verticalLineTo(6.5f)
                curveTo(13.0f, 6.367f, 12.947f, 6.24f, 12.854f, 6.146f)
                curveTo(12.76f, 6.053f, 12.633f, 6.0f, 12.5f, 6.0f)
                close()
                moveTo(12.0f, 9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _memory!!
    }

@Suppress("ObjectPropertyName")
private var _memory: ImageVector? = null

@Preview
@Composable
private fun MemoryPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Memory, contentDescription = null)
    }
}

