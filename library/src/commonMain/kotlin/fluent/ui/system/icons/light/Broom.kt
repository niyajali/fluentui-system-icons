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
package fluent.ui.system.icons.light

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

public val FluentIcons.Light.Broom: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Broom",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(29.853f, 2.854f)
            curveTo(30.049f, 2.658f, 30.049f, 2.342f, 29.853f, 2.146f)
            curveTo(29.658f, 1.951f, 29.341f, 1.951f, 29.146f, 2.146f)
            lineTo(19.352f, 11.941f)
            curveTo(18.069f, 10.83f, 16.396f, 10.158f, 14.566f, 10.158f)
            curveTo(12.496f, 10.158f, 10.626f, 11.019f, 9.295f, 12.4f)
            curveTo(8.524f, 13.202f, 7.786f, 13.922f, 6.876f, 14.304f)
            lineTo(2.622f, 16.088f)
            curveTo(1.967f, 16.363f, 1.799f, 17.214f, 2.302f, 17.717f)
            lineTo(14.282f, 29.697f)
            curveTo(14.782f, 30.198f, 15.63f, 30.035f, 15.908f, 29.384f)
            lineTo(17.723f, 25.149f)
            curveTo(18.108f, 24.251f, 18.824f, 23.524f, 19.619f, 22.764f)
            curveTo(21.013f, 21.432f, 21.882f, 19.554f, 21.882f, 17.473f)
            curveTo(21.882f, 15.623f, 21.195f, 13.933f, 20.062f, 12.645f)
            lineTo(29.853f, 2.854f)
            close()
            moveTo(14.566f, 11.158f)
            curveTo(18.054f, 11.158f, 20.882f, 13.986f, 20.882f, 17.473f)
            curveTo(20.882f, 19.27f, 20.133f, 20.89f, 18.928f, 22.04f)
            curveTo(18.571f, 22.382f, 18.197f, 22.745f, 17.851f, 23.144f)
            lineTo(8.89f, 14.183f)
            curveTo(9.297f, 13.834f, 9.668f, 13.455f, 10.016f, 13.094f)
            curveTo(11.165f, 11.9f, 12.779f, 11.158f, 14.566f, 11.158f)
            close()
            moveTo(7.262f, 15.226f)
            curveTo(7.552f, 15.105f, 7.825f, 14.957f, 8.083f, 14.791f)
            lineTo(17.24f, 23.947f)
            curveTo(17.074f, 24.201f, 16.926f, 24.47f, 16.804f, 24.755f)
            lineTo(14.989f, 28.99f)
            lineTo(3.009f, 17.01f)
            lineTo(7.262f, 15.226f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BroomPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Broom, contentDescription = null)
    }
}
