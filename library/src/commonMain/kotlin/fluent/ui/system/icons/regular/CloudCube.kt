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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.CloudCube: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CloudCube",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 5.5f)
            curveTo(9.587f, 5.5f, 7.617f, 7.4f, 7.505f, 9.785f)
            curveTo(7.486f, 10.185f, 7.156f, 10.5f, 6.756f, 10.5f)
            horizontalLineTo(6.5f)
            curveTo(4.843f, 10.5f, 3.5f, 11.843f, 3.5f, 13.5f)
            curveTo(3.5f, 15.157f, 4.843f, 16.5f, 6.5f, 16.5f)
            horizontalLineTo(12f)
            verticalLineTo(17.753f)
            curveTo(12f, 17.836f, 12.004f, 17.918f, 12.012f, 18f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 18f, 2f, 15.985f, 2f, 13.5f)
            curveTo(2f, 11.156f, 3.792f, 9.231f, 6.08f, 9.019f)
            curveTo(6.548f, 6.172f, 9.02f, 4f, 12f, 4f)
            curveTo(14.974f, 4f, 17.441f, 6.163f, 17.917f, 9.001f)
            curveTo(17.562f, 9.013f, 17.208f, 9.101f, 16.882f, 9.264f)
            lineTo(16.469f, 9.47f)
            curveTo(16.207f, 7.235f, 14.306f, 5.5f, 12f, 5.5f)
            close()
            moveTo(22.171f, 11.908f)
            lineTo(18.671f, 10.158f)
            curveTo(18.249f, 9.947f, 17.751f, 9.947f, 17.329f, 10.158f)
            lineTo(13.829f, 11.908f)
            curveTo(13.321f, 12.162f, 13f, 12.682f, 13f, 13.25f)
            verticalLineTo(17.753f)
            curveTo(13f, 18.321f, 13.321f, 18.84f, 13.829f, 19.095f)
            lineTo(17.329f, 20.845f)
            curveTo(17.751f, 21.056f, 18.249f, 21.056f, 18.671f, 20.845f)
            lineTo(22.171f, 19.095f)
            curveTo(22.679f, 18.84f, 23f, 18.321f, 23f, 17.753f)
            verticalLineTo(13.25f)
            curveTo(23f, 12.682f, 22.679f, 12.162f, 22.171f, 11.908f)
            close()
            moveTo(14.553f, 13.276f)
            curveTo(14.676f, 13.029f, 14.977f, 12.929f, 15.224f, 13.053f)
            lineTo(18f, 14.441f)
            lineTo(20.776f, 13.053f)
            curveTo(21.023f, 12.929f, 21.324f, 13.029f, 21.447f, 13.276f)
            curveTo(21.571f, 13.523f, 21.471f, 13.824f, 21.224f, 13.947f)
            lineTo(18.5f, 15.309f)
            verticalLineTo(18.5f)
            curveTo(18.5f, 18.776f, 18.276f, 19f, 18f, 19f)
            curveTo(17.724f, 19f, 17.5f, 18.776f, 17.5f, 18.5f)
            verticalLineTo(15.309f)
            lineTo(14.776f, 13.947f)
            curveTo(14.529f, 13.824f, 14.429f, 13.523f, 14.553f, 13.276f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CloudCubePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CloudCube, contentDescription = null)
    }
}
