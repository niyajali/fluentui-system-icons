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

public val FluentIcons.Regular.Attach: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Attach",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.772f, 3.744f)
            curveTo(14.114f, 1.4f, 17.913f, 1.4f, 20.256f, 3.744f)
            curveTo(22.539f, 6.027f, 22.597f, 9.692f, 20.431f, 12.046f)
            lineTo(20.243f, 12.243f)
            lineTo(11.443f, 21.041f)
            lineTo(11.407f, 21.072f)
            curveTo(9.945f, 22.388f, 7.691f, 22.344f, 6.284f, 20.936f)
            curveTo(4.965f, 19.617f, 4.843f, 17.555f, 5.918f, 16.098f)
            curveTo(5.941f, 16.052f, 5.969f, 16.009f, 6.002f, 15.968f)
            lineTo(6.056f, 15.908f)
            lineTo(6.143f, 15.82f)
            lineTo(6.284f, 15.672f)
            lineTo(6.287f, 15.675f)
            lineTo(13.723f, 8.221f)
            curveTo(13.989f, 7.954f, 14.405f, 7.93f, 14.699f, 8.147f)
            lineTo(14.783f, 8.22f)
            curveTo(15.05f, 8.485f, 15.075f, 8.902f, 14.857f, 9.196f)
            lineTo(14.785f, 9.28f)
            lineTo(7.19f, 16.893f)
            curveTo(6.473f, 17.769f, 6.522f, 19.063f, 7.34f, 19.881f)
            curveTo(8.169f, 20.71f, 9.488f, 20.749f, 10.364f, 19.999f)
            lineTo(19.197f, 11.168f)
            curveTo(20.952f, 9.411f, 20.952f, 6.562f, 19.195f, 4.804f)
            curveTo(17.493f, 3.102f, 14.766f, 3.049f, 12.999f, 4.645f)
            lineTo(12.831f, 4.804f)
            lineTo(12.819f, 4.819f)
            lineTo(3.282f, 14.355f)
            curveTo(2.989f, 14.648f, 2.515f, 14.648f, 2.222f, 14.355f)
            curveTo(1.955f, 14.089f, 1.931f, 13.672f, 2.149f, 13.378f)
            lineTo(2.222f, 13.294f)
            lineTo(11.771f, 3.744f)
            lineTo(11.772f, 3.744f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AttachPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Attach, contentDescription = null)
    }
}
