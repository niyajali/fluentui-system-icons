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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.Bench: ImageVector
    get() {
        if (_Bench != null) {
            return _Bench!!
        }
        _Bench = ImageVector.Builder(
            name = "Filled.Bench",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.75f, 4f)
                curveTo(4.231f, 4f, 3f, 5.231f, 3f, 6.75f)
                verticalLineTo(12f)
                horizontalLineTo(21f)
                verticalLineTo(6.75f)
                curveTo(21f, 5.231f, 19.769f, 4f, 18.25f, 4f)
                horizontalLineTo(5.75f)
                close()
                moveTo(3f, 13f)
                curveTo(1.895f, 13f, 1f, 13.895f, 1f, 15f)
                curveTo(1f, 16.105f, 1.895f, 17f, 3f, 17f)
                verticalLineTo(19.25f)
                curveTo(3f, 19.664f, 3.336f, 20f, 3.75f, 20f)
                curveTo(4.164f, 20f, 4.5f, 19.664f, 4.5f, 19.25f)
                verticalLineTo(17f)
                horizontalLineTo(19.5f)
                verticalLineTo(19.25f)
                curveTo(19.5f, 19.664f, 19.836f, 20f, 20.25f, 20f)
                curveTo(20.664f, 20f, 21f, 19.664f, 21f, 19.25f)
                lineTo(21f, 17f)
                curveTo(22.105f, 17f, 23f, 16.105f, 23f, 15f)
                curveTo(23f, 13.895f, 22.105f, 13f, 21f, 13f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _Bench!!
    }

@Suppress("ObjectPropertyName")
private var _Bench: ImageVector? = null

@Preview
@Composable
private fun BenchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Bench, contentDescription = null)
    }
}
