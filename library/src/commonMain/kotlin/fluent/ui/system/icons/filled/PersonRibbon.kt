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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.PersonRibbon: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonRibbon",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15f, 15.505f)
            curveTo(15f, 14.978f, 15.09f, 14.473f, 15.256f, 14.004f)
            horizontalLineTo(6.253f)
            curveTo(5.011f, 14.004f, 4.004f, 15.011f, 4.004f, 16.253f)
            verticalLineTo(17.174f)
            curveTo(4.004f, 17.746f, 4.182f, 18.304f, 4.514f, 18.77f)
            curveTo(6.056f, 20.935f, 8.579f, 22.008f, 12f, 22.008f)
            curveTo(13.511f, 22.008f, 14.846f, 21.799f, 16f, 21.379f)
            verticalLineTo(18.334f)
            curveTo(15.375f, 17.561f, 15f, 16.577f, 15f, 15.505f)
            close()
            moveTo(12f, 2.004f)
            curveTo(14.762f, 2.004f, 17f, 4.244f, 17f, 7.006f)
            curveTo(17f, 9.768f, 14.762f, 12.008f, 12f, 12.008f)
            curveTo(9.239f, 12.008f, 7f, 9.768f, 7f, 7.006f)
            curveTo(7f, 4.244f, 9.239f, 2.004f, 12f, 2.004f)
            close()
            moveTo(23f, 15.505f)
            curveTo(23f, 17.438f, 21.433f, 19.006f, 19.5f, 19.006f)
            curveTo(17.567f, 19.006f, 16f, 17.438f, 16f, 15.505f)
            curveTo(16f, 13.571f, 17.567f, 12.003f, 19.5f, 12.003f)
            curveTo(21.433f, 12.003f, 23f, 13.571f, 23f, 15.505f)
            close()
            moveTo(22f, 19.248f)
            curveTo(21.285f, 19.727f, 20.425f, 20.006f, 19.5f, 20.006f)
            curveTo(18.575f, 20.006f, 17.715f, 19.727f, 17f, 19.248f)
            verticalLineTo(22.754f)
            curveTo(17f, 22.955f, 17.226f, 23.074f, 17.392f, 22.96f)
            lineTo(19.5f, 21.507f)
            lineTo(21.608f, 22.96f)
            curveTo(21.774f, 23.074f, 22f, 22.955f, 22f, 22.754f)
            verticalLineTo(19.248f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonRibbonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonRibbon, contentDescription = null)
    }
}
