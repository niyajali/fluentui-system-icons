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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.PhoneKey: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PhoneKey",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.75f, 2f)
            curveTo(16.993f, 2f, 18f, 3.007f, 18f, 4.25f)
            verticalLineTo(11.256f)
            curveTo(17.441f, 11.454f, 16.933f, 11.759f, 16.5f, 12.146f)
            verticalLineTo(4.25f)
            curveTo(16.5f, 3.836f, 16.164f, 3.5f, 15.75f, 3.5f)
            horizontalLineTo(8.25f)
            curveTo(7.836f, 3.5f, 7.5f, 3.836f, 7.5f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(7.5f, 20.164f, 7.836f, 20.5f, 8.25f, 20.5f)
            horizontalLineTo(11.028f)
            curveTo(11.009f, 20.602f, 11f, 20.706f, 11f, 20.811f)
            verticalLineTo(22f)
            horizontalLineTo(8.25f)
            curveTo(7.007f, 22f, 6f, 20.993f, 6f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(6f, 3.007f, 7.007f, 2f, 8.25f, 2f)
            horizontalLineTo(15.75f)
            close()
            moveTo(13.249f, 17.5f)
            curveTo(13.349f, 17.5f, 13.444f, 17.519f, 13.531f, 17.555f)
            lineTo(12.084f, 19.002f)
            lineTo(10.751f, 19.004f)
            curveTo(10.337f, 19.004f, 10.001f, 18.669f, 10f, 18.255f)
            curveTo(9.999f, 17.841f, 10.335f, 17.504f, 10.749f, 17.504f)
            lineTo(13.249f, 17.5f)
            close()
            moveTo(19.5f, 19f)
            curveTo(21.433f, 19f, 23f, 17.433f, 23f, 15.5f)
            curveTo(23f, 13.567f, 21.433f, 12f, 19.5f, 12f)
            curveTo(17.567f, 12f, 16f, 13.567f, 16f, 15.5f)
            curveTo(16f, 15.816f, 16.042f, 16.122f, 16.12f, 16.414f)
            curveTo(16.067f, 16.445f, 16.016f, 16.484f, 15.97f, 16.53f)
            lineTo(12.22f, 20.28f)
            curveTo(12.079f, 20.421f, 12f, 20.612f, 12f, 20.811f)
            verticalLineTo(22.25f)
            curveTo(12f, 22.664f, 12.336f, 23f, 12.75f, 23f)
            horizontalLineTo(14.5f)
            curveTo(14.776f, 23f, 15f, 22.776f, 15f, 22.5f)
            verticalLineTo(22f)
            horizontalLineTo(16f)
            curveTo(16.276f, 22f, 16.5f, 21.776f, 16.5f, 21.5f)
            verticalLineTo(20.5f)
            horizontalLineTo(17.5f)
            curveTo(17.776f, 20.5f, 18f, 20.276f, 18f, 20f)
            verticalLineTo(19f)
            horizontalLineTo(19.5f)
            close()
            moveTo(21f, 15f)
            curveTo(21f, 15.552f, 20.552f, 16f, 20f, 16f)
            curveTo(19.448f, 16f, 19f, 15.552f, 19f, 15f)
            curveTo(19f, 14.448f, 19.448f, 14f, 20f, 14f)
            curveTo(20.552f, 14f, 21f, 14.448f, 21f, 15f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PhoneKeyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PhoneKey, contentDescription = null)
    }
}
