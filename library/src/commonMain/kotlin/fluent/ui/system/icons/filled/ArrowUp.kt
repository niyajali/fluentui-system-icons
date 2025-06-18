/**
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

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.ArrowUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.284f, 10.295f)
            curveTo(3.896f, 10.688f, 3.901f, 11.321f, 4.294f, 11.709f)
            curveTo(4.688f, 12.097f, 5.321f, 12.092f, 5.708f, 11.699f)
            lineTo(11f, 6.328f)
            verticalLineTo(19.999f)
            curveTo(11f, 20.552f, 11.448f, 20.999f, 12f, 20.999f)
            curveTo(12.552f, 20.999f, 13f, 20.552f, 13f, 19.999f)
            verticalLineTo(6.335f)
            lineTo(18.285f, 11.699f)
            curveTo(18.672f, 12.092f, 19.306f, 12.097f, 19.699f, 11.709f)
            curveTo(20.092f, 11.321f, 20.097f, 10.688f, 19.709f, 10.295f)
            lineTo(12.887f, 3.371f)
            curveTo(12.397f, 2.874f, 11.596f, 2.874f, 11.106f, 3.371f)
            lineTo(4.284f, 10.295f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowUp, contentDescription = null)
    }
}
