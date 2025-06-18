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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.Dust: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Dust",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6f, 4f)
            curveTo(6.552f, 4f, 7f, 3.552f, 7f, 3f)
            curveTo(7f, 2.448f, 6.552f, 2f, 6f, 2f)
            curveTo(5.448f, 2f, 5f, 2.448f, 5f, 3f)
            curveTo(5f, 3.552f, 5.448f, 4f, 6f, 4f)
            close()
            moveTo(22f, 12f)
            curveTo(22f, 12.552f, 21.552f, 13f, 21f, 13f)
            curveTo(20.448f, 13f, 20f, 12.552f, 20f, 12f)
            curveTo(20f, 11.448f, 20.448f, 11f, 21f, 11f)
            curveTo(21.552f, 11f, 22f, 11.448f, 22f, 12f)
            close()
            moveTo(7f, 21f)
            curveTo(7f, 21.552f, 6.552f, 22f, 6f, 22f)
            curveTo(5.448f, 22f, 5f, 21.552f, 5f, 21f)
            curveTo(5f, 20.448f, 5.448f, 20f, 6f, 20f)
            curveTo(6.552f, 20f, 7f, 20.448f, 7f, 21f)
            close()
            moveTo(8.664f, 6.943f)
            curveTo(9.245f, 4.676f, 11.302f, 3f, 13.75f, 3f)
            curveTo(16.649f, 3f, 19f, 5.351f, 19f, 8.25f)
            curveTo(19f, 9.72f, 18.396f, 11.048f, 17.424f, 12f)
            curveTo(18.396f, 12.952f, 19f, 14.281f, 19f, 15.75f)
            curveTo(19f, 18.649f, 16.649f, 21f, 13.75f, 21f)
            curveTo(11.302f, 21f, 9.245f, 19.324f, 8.664f, 17.057f)
            curveTo(8.214f, 17.183f, 7.739f, 17.25f, 7.25f, 17.25f)
            curveTo(4.351f, 17.25f, 2f, 14.899f, 2f, 12f)
            curveTo(2f, 9.101f, 4.351f, 6.75f, 7.25f, 6.75f)
            curveTo(7.739f, 6.75f, 8.214f, 6.817f, 8.664f, 6.943f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DustPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Dust, contentDescription = null)
    }
}
