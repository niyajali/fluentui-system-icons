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

public val FluentIcons.Regular.DocumentCube: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentCube",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6f, 2f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineTo(11.705f)
            lineTo(4.882f, 11.264f)
            curveTo(5.08f, 11.165f, 5.288f, 11.094f, 5.5f, 11.05f)
            verticalLineTo(4f)
            curveTo(5.5f, 3.724f, 5.724f, 3.5f, 6f, 3.5f)
            horizontalLineTo(12f)
            verticalLineTo(8f)
            curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
            horizontalLineTo(18.5f)
            verticalLineTo(20f)
            curveTo(18.5f, 20.276f, 18.276f, 20.5f, 18f, 20.5f)
            horizontalLineTo(11.886f)
            curveTo(11.686f, 21.138f, 11.235f, 21.681f, 10.618f, 21.989f)
            lineTo(10.596f, 22f)
            horizontalLineTo(18f)
            curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
            verticalLineTo(9.828f)
            curveTo(20f, 9.297f, 19.789f, 8.789f, 19.414f, 8.414f)
            lineTo(13.586f, 2.586f)
            curveTo(13.211f, 2.211f, 12.703f, 2f, 12.172f, 2f)
            horizontalLineTo(6f)
            close()
            moveTo(17.379f, 8.5f)
            horizontalLineTo(14f)
            curveTo(13.724f, 8.5f, 13.5f, 8.276f, 13.5f, 8f)
            verticalLineTo(4.621f)
            lineTo(17.379f, 8.5f)
            close()
            moveTo(6.671f, 12.158f)
            lineTo(10.171f, 13.908f)
            curveTo(10.679f, 14.162f, 11f, 14.682f, 11f, 15.25f)
            verticalLineTo(19.753f)
            curveTo(11f, 20.321f, 10.679f, 20.84f, 10.171f, 21.095f)
            lineTo(6.671f, 22.845f)
            curveTo(6.249f, 23.056f, 5.751f, 23.056f, 5.329f, 22.845f)
            lineTo(1.829f, 21.095f)
            curveTo(1.321f, 20.84f, 1f, 20.321f, 1f, 19.753f)
            verticalLineTo(15.25f)
            curveTo(1f, 14.682f, 1.321f, 14.162f, 1.829f, 13.908f)
            lineTo(5.329f, 12.158f)
            curveTo(5.751f, 11.947f, 6.249f, 11.947f, 6.671f, 12.158f)
            close()
            moveTo(3.224f, 15.053f)
            curveTo(2.977f, 14.929f, 2.676f, 15.029f, 2.553f, 15.276f)
            curveTo(2.429f, 15.523f, 2.529f, 15.824f, 2.776f, 15.947f)
            lineTo(5.5f, 17.309f)
            verticalLineTo(20.5f)
            curveTo(5.5f, 20.776f, 5.724f, 21f, 6f, 21f)
            curveTo(6.276f, 21f, 6.5f, 20.776f, 6.5f, 20.5f)
            verticalLineTo(17.309f)
            lineTo(9.224f, 15.947f)
            curveTo(9.471f, 15.824f, 9.571f, 15.523f, 9.447f, 15.276f)
            curveTo(9.324f, 15.029f, 9.023f, 14.929f, 8.776f, 15.053f)
            lineTo(6f, 16.441f)
            lineTo(3.224f, 15.053f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentCubePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentCube, contentDescription = null)
    }
}
