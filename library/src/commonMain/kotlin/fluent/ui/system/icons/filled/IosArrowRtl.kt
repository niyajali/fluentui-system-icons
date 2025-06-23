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

public val FluentIcons.Filled.IosArrowRtl: ImageVector
    get() {
        if (_IosArrowRtl != null) {
            return _IosArrowRtl!!
        }
        _IosArrowRtl = ImageVector.Builder(
            name = "Filled.IosArrowRtl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.273f, 3.687f)
                curveTo(10.894f, 3.285f, 10.911f, 2.652f, 11.313f, 2.273f)
                curveTo(11.715f, 1.894f, 12.347f, 1.912f, 12.727f, 2.313f)
                lineTo(21.227f, 11.313f)
                curveTo(21.591f, 11.699f, 21.591f, 12.301f, 21.227f, 12.687f)
                lineTo(12.727f, 21.688f)
                curveTo(12.348f, 22.09f, 11.715f, 22.108f, 11.313f, 21.729f)
                curveTo(10.912f, 21.349f, 10.893f, 20.716f, 11.273f, 20.315f)
                lineTo(19.125f, 12f)
                lineTo(11.273f, 3.687f)
                close()
            }
        }.build()

        return _IosArrowRtl!!
    }

@Suppress("ObjectPropertyName")
private var _IosArrowRtl: ImageVector? = null

@Preview
@Composable
private fun IosArrowRtlPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.IosArrowRtl, contentDescription = null)
    }
}
