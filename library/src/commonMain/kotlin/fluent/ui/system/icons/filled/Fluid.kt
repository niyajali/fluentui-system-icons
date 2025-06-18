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

public val FluentIcons.Filled.Fluid: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Fluid",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11f, 5f)
            horizontalLineTo(16.745f)
            curveTo(17.988f, 5f, 18.995f, 6.007f, 18.995f, 7.25f)
            verticalLineTo(11f)
            horizontalLineTo(17.495f)
            verticalLineTo(7.25f)
            curveTo(17.495f, 6.836f, 17.159f, 6.5f, 16.745f, 6.5f)
            horizontalLineTo(11f)
            verticalLineTo(5f)
            close()
            moveTo(6.5f, 11f)
            verticalLineTo(16.745f)
            curveTo(6.5f, 17.159f, 6.836f, 17.495f, 7.25f, 17.495f)
            horizontalLineTo(11f)
            verticalLineTo(18.995f)
            horizontalLineTo(7.25f)
            curveTo(6.007f, 18.995f, 5f, 17.988f, 5f, 16.745f)
            verticalLineTo(11f)
            horizontalLineTo(6.5f)
            close()
            moveTo(2f, 4.25f)
            curveTo(2f, 3.007f, 3.007f, 2f, 4.25f, 2f)
            horizontalLineTo(7.75f)
            curveTo(8.993f, 2f, 10f, 3.007f, 10f, 4.25f)
            verticalLineTo(7.75f)
            curveTo(10f, 8.993f, 8.993f, 10f, 7.75f, 10f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 10f, 2f, 8.993f, 2f, 7.75f)
            verticalLineTo(4.25f)
            close()
            moveTo(12f, 14.25f)
            curveTo(12f, 13.007f, 13.007f, 12f, 14.25f, 12f)
            horizontalLineTo(19.75f)
            curveTo(20.993f, 12f, 22f, 13.007f, 22f, 14.25f)
            verticalLineTo(19.75f)
            curveTo(22f, 20.993f, 20.993f, 22f, 19.75f, 22f)
            horizontalLineTo(14.25f)
            curveTo(13.007f, 22f, 12f, 20.993f, 12f, 19.75f)
            verticalLineTo(14.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FluidPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Fluid, contentDescription = null)
    }
}
