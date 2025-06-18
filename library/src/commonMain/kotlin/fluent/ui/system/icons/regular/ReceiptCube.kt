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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.ReceiptCube: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ReceiptCube",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 5.25f)
            curveTo(4f, 4.007f, 5.007f, 3f, 6.25f, 3f)
            horizontalLineTo(15.75f)
            curveTo(16.993f, 3f, 18f, 4.007f, 18f, 5.25f)
            verticalLineTo(14f)
            horizontalLineTo(22f)
            verticalLineTo(17.75f)
            curveTo(22f, 19.545f, 20.545f, 21f, 18.75f, 21f)
            horizontalLineTo(11.667f)
            curveTo(11.881f, 20.628f, 12f, 20.199f, 12f, 19.753f)
            verticalLineTo(19.5f)
            horizontalLineTo(16.5f)
            verticalLineTo(5.25f)
            curveTo(16.5f, 4.836f, 16.164f, 4.5f, 15.75f, 4.5f)
            horizontalLineTo(6.25f)
            curveTo(5.836f, 4.5f, 5.5f, 4.836f, 5.5f, 5.25f)
            verticalLineTo(11.05f)
            curveTo(5.288f, 11.094f, 5.08f, 11.165f, 4.882f, 11.264f)
            lineTo(4f, 11.705f)
            verticalLineTo(5.25f)
            close()
            moveTo(13.75f, 12.5f)
            horizontalLineTo(9.59f)
            lineTo(7.55f, 11.48f)
            curveTo(7.658f, 11.199f, 7.931f, 11f, 8.25f, 11f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 11f, 14.5f, 11.336f, 14.5f, 11.75f)
            curveTo(14.5f, 12.164f, 14.164f, 12.5f, 13.75f, 12.5f)
            close()
            moveTo(18f, 19.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 19.5f, 20.5f, 18.716f, 20.5f, 17.75f)
            verticalLineTo(15.5f)
            horizontalLineTo(18f)
            verticalLineTo(19.5f)
            close()
            moveTo(8.25f, 7f)
            curveTo(7.836f, 7f, 7.5f, 7.336f, 7.5f, 7.75f)
            curveTo(7.5f, 8.164f, 7.836f, 8.5f, 8.25f, 8.5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 8.5f, 14.5f, 8.164f, 14.5f, 7.75f)
            curveTo(14.5f, 7.336f, 14.164f, 7f, 13.75f, 7f)
            horizontalLineTo(8.25f)
            close()
            moveTo(10.171f, 13.908f)
            lineTo(6.671f, 12.158f)
            curveTo(6.249f, 11.947f, 5.751f, 11.947f, 5.329f, 12.158f)
            lineTo(1.829f, 13.908f)
            curveTo(1.321f, 14.162f, 1f, 14.682f, 1f, 15.25f)
            verticalLineTo(19.753f)
            curveTo(1f, 20.321f, 1.321f, 20.84f, 1.829f, 21.095f)
            lineTo(5.329f, 22.845f)
            curveTo(5.751f, 23.056f, 6.249f, 23.056f, 6.671f, 22.845f)
            lineTo(10.171f, 21.095f)
            curveTo(10.679f, 20.84f, 11f, 20.321f, 11f, 19.753f)
            verticalLineTo(15.25f)
            curveTo(11f, 14.682f, 10.679f, 14.162f, 10.171f, 13.908f)
            close()
            moveTo(2.553f, 15.276f)
            curveTo(2.676f, 15.029f, 2.977f, 14.929f, 3.224f, 15.053f)
            lineTo(6f, 16.441f)
            lineTo(8.776f, 15.053f)
            curveTo(9.023f, 14.929f, 9.324f, 15.029f, 9.447f, 15.276f)
            curveTo(9.571f, 15.523f, 9.471f, 15.824f, 9.224f, 15.947f)
            lineTo(6.5f, 17.309f)
            verticalLineTo(20.5f)
            curveTo(6.5f, 20.776f, 6.276f, 21f, 6f, 21f)
            curveTo(5.724f, 21f, 5.5f, 20.776f, 5.5f, 20.5f)
            verticalLineTo(17.309f)
            lineTo(2.776f, 15.947f)
            curveTo(2.529f, 15.824f, 2.429f, 15.523f, 2.553f, 15.276f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ReceiptCubePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ReceiptCube, contentDescription = null)
    }
}
