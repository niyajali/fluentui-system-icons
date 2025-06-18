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

public val FluentIcons.Regular.PhoneAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PhoneAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            close()
            moveTo(13.75f, 2f)
            curveTo(14.993f, 2f, 16f, 3.007f, 16f, 4.25f)
            lineTo(16f, 11.174f)
            curveTo(15.472f, 11.299f, 14.969f, 11.488f, 14.5f, 11.732f)
            lineTo(14.5f, 4.25f)
            curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
            horizontalLineTo(6.25f)
            curveTo(5.836f, 3.5f, 5.5f, 3.836f, 5.5f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(5.5f, 20.164f, 5.836f, 20.5f, 6.25f, 20.5f)
            lineTo(11.733f, 20.501f)
            curveTo(12.02f, 21.052f, 12.384f, 21.557f, 12.81f, 22.001f)
            lineTo(6.25f, 22f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineTo(13.75f)
            close()
            moveTo(17.5f, 13.999f)
            lineTo(17.41f, 14.007f)
            curveTo(17.206f, 14.044f, 17.045f, 14.205f, 17.008f, 14.409f)
            lineTo(17f, 14.499f)
            lineTo(17f, 16.999f)
            lineTo(14.498f, 17f)
            lineTo(14.408f, 17.008f)
            curveTo(14.204f, 17.045f, 14.043f, 17.206f, 14.006f, 17.41f)
            lineTo(13.998f, 17.5f)
            lineTo(14.006f, 17.59f)
            curveTo(14.043f, 17.794f, 14.204f, 17.955f, 14.408f, 17.992f)
            lineTo(14.498f, 18f)
            lineTo(17.001f, 17.999f)
            lineTo(17.001f, 20.503f)
            lineTo(17.009f, 20.593f)
            curveTo(17.046f, 20.798f, 17.207f, 20.958f, 17.411f, 20.995f)
            lineTo(17.501f, 21.003f)
            lineTo(17.591f, 20.995f)
            curveTo(17.795f, 20.958f, 17.956f, 20.798f, 17.993f, 20.593f)
            lineTo(18.001f, 20.503f)
            lineTo(18.001f, 17.999f)
            lineTo(20.505f, 18f)
            lineTo(20.594f, 17.992f)
            curveTo(20.799f, 17.955f, 20.959f, 17.794f, 20.997f, 17.59f)
            lineTo(21.005f, 17.5f)
            lineTo(20.997f, 17.41f)
            curveTo(20.959f, 17.206f, 20.799f, 17.045f, 20.594f, 17.008f)
            lineTo(20.505f, 17f)
            lineTo(18f, 16.999f)
            lineTo(18f, 14.499f)
            lineTo(17.992f, 14.409f)
            curveTo(17.955f, 14.205f, 17.794f, 14.044f, 17.59f, 14.007f)
            lineTo(17.5f, 13.999f)
            close()
            moveTo(8.749f, 17.504f)
            lineTo(11f, 17.499f)
            curveTo(11f, 18.016f, 11.06f, 18.518f, 11.174f, 19f)
            lineTo(8.751f, 19.004f)
            curveTo(8.337f, 19.004f, 8.001f, 18.669f, 8f, 18.255f)
            curveTo(7.999f, 17.841f, 8.335f, 17.504f, 8.749f, 17.504f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PhoneAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PhoneAdd, contentDescription = null)
    }
}
