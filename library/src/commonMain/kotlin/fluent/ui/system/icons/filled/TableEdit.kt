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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.TableEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.49f, 19.818f)
            curveTo(12.608f, 19.346f, 12.852f, 18.915f, 13.196f, 18.57f)
            lineTo(19.098f, 12.669f)
            curveTo(19.376f, 12.391f, 19.708f, 12.199f, 20.06f, 12.094f)
            curveTo(20.078f, 12.089f, 20.095f, 12.084f, 20.113f, 12.08f)
            curveTo(20.236f, 12.046f, 20.362f, 12.023f, 20.49f, 12.01f)
            curveTo(21.147f, 11.946f, 21.827f, 12.165f, 22.331f, 12.669f)
            curveTo(23.223f, 13.561f, 23.223f, 15.008f, 22.331f, 15.901f)
            lineTo(16.429f, 21.803f)
            curveTo(16.085f, 22.147f, 15.653f, 22.391f, 15.181f, 22.509f)
            lineTo(13.351f, 22.967f)
            curveTo(12.555f, 23.166f, 11.834f, 22.444f, 12.033f, 21.648f)
            lineTo(12.49f, 19.818f)
            close()
            moveTo(9.499f, 20.998f)
            horizontalLineTo(11.164f)
            lineTo(11.52f, 19.575f)
            curveTo(11.682f, 18.927f, 12.017f, 18.336f, 12.489f, 17.864f)
            lineTo(14.354f, 15.999f)
            horizontalLineTo(9.499f)
            lineTo(9.499f, 20.998f)
            close()
            moveTo(15.999f, 9.499f)
            lineTo(15.999f, 14.354f)
            lineTo(18.391f, 11.962f)
            curveTo(19.105f, 11.248f, 20.066f, 10.931f, 20.998f, 11.012f)
            verticalLineTo(9.499f)
            horizontalLineTo(15.999f)
            close()
            moveTo(20.998f, 8f)
            verticalLineTo(6.25f)
            curveTo(20.998f, 4.455f, 19.544f, 3f, 17.749f, 3f)
            horizontalLineTo(15.999f)
            verticalLineTo(8f)
            horizontalLineTo(20.998f)
            close()
            moveTo(14.499f, 3f)
            horizontalLineTo(9.499f)
            lineTo(9.499f, 8f)
            horizontalLineTo(14.499f)
            verticalLineTo(3f)
            close()
            moveTo(8f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(8f)
            horizontalLineTo(8f)
            lineTo(8f, 3f)
            close()
            moveTo(3f, 9.499f)
            verticalLineTo(14.499f)
            horizontalLineTo(8f)
            verticalLineTo(9.499f)
            horizontalLineTo(3f)
            close()
            moveTo(3f, 15.999f)
            verticalLineTo(17.749f)
            curveTo(3f, 19.544f, 4.455f, 20.998f, 6.25f, 20.998f)
            horizontalLineTo(8f)
            lineTo(8f, 15.999f)
            horizontalLineTo(3f)
            close()
            moveTo(14.499f, 9.499f)
            lineTo(14.499f, 14.499f)
            horizontalLineTo(9.499f)
            verticalLineTo(9.499f)
            horizontalLineTo(14.499f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TableEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TableEdit, contentDescription = null)
    }
}
