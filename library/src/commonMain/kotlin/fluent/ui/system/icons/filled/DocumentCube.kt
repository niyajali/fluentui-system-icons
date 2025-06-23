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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.DocumentCube: ImageVector
    get() {
        if (_DocumentCube != null) {
            return _DocumentCube!!
        }
        _DocumentCube = ImageVector.Builder(
            name = "Filled.DocumentCube",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                verticalLineTo(8f)
                curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                curveTo(20f, 21.105f, 19.105f, 22f, 18f, 22f)
                horizontalLineTo(10.596f)
                lineTo(10.618f, 21.989f)
                curveTo(11.465f, 21.566f, 12f, 20.7f, 12f, 19.753f)
                verticalLineTo(15.25f)
                curveTo(12f, 14.303f, 11.465f, 13.437f, 10.618f, 13.014f)
                lineTo(7.118f, 11.264f)
                curveTo(6.414f, 10.912f, 5.586f, 10.912f, 4.882f, 11.264f)
                lineTo(4f, 11.705f)
                verticalLineTo(4f)
                curveTo(4f, 2.895f, 4.895f, 2f, 6f, 2f)
                horizontalLineTo(12f)
                close()
                moveTo(13.5f, 2.5f)
                verticalLineTo(8f)
                curveTo(13.5f, 8.276f, 13.724f, 8.5f, 14f, 8.5f)
                horizontalLineTo(19.5f)
                lineTo(13.5f, 2.5f)
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

        return _DocumentCube!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentCube: ImageVector? = null

@Preview
@Composable
private fun DocumentCubePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentCube, contentDescription = null)
    }
}
