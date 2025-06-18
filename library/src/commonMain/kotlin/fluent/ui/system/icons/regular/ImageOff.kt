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

public val FluentUi.Regular.ImageOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ImageOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(3.483f, 4.544f)
            curveTo(3.177f, 5.04f, 3f, 5.624f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(18.376f, 21f, 18.96f, 20.823f, 19.456f, 20.517f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(11.119f, 12.18f)
            curveTo(10.868f, 12.286f, 10.632f, 12.441f, 10.426f, 12.643f)
            lineTo(4.603f, 18.344f)
            curveTo(4.536f, 18.158f, 4.5f, 17.958f, 4.5f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(4.5f, 6.044f, 4.536f, 5.846f, 4.601f, 5.662f)
            lineTo(11.119f, 12.18f)
            close()
            moveTo(19.5f, 6.25f)
            verticalLineTo(16.318f)
            lineTo(20.999f, 17.818f)
            curveTo(21f, 17.795f, 21f, 17.773f, 21f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            curveTo(6.227f, 3f, 6.205f, 3f, 6.183f, 3.001f)
            lineTo(7.682f, 4.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
            close()
            moveTo(18.33f, 19.401f)
            curveTo(18.149f, 19.465f, 17.954f, 19.5f, 17.75f, 19.5f)
            horizontalLineTo(6.25f)
            curveTo(6.046f, 19.5f, 5.85f, 19.465f, 5.668f, 19.401f)
            lineTo(11.475f, 13.715f)
            lineTo(11.559f, 13.644f)
            curveTo(11.85f, 13.432f, 12.26f, 13.455f, 12.525f, 13.715f)
            lineTo(18.33f, 19.401f)
            close()
            moveTo(15.252f, 6.5f)
            curveTo(16.496f, 6.5f, 17.504f, 7.508f, 17.504f, 8.752f)
            curveTo(17.504f, 9.996f, 16.496f, 11.004f, 15.252f, 11.004f)
            curveTo(14.008f, 11.004f, 13f, 9.996f, 13f, 8.752f)
            curveTo(13f, 7.508f, 14.008f, 6.5f, 15.252f, 6.5f)
            close()
            moveTo(15.252f, 8f)
            curveTo(14.837f, 8f, 14.5f, 8.337f, 14.5f, 8.752f)
            curveTo(14.5f, 9.167f, 14.837f, 9.504f, 15.252f, 9.504f)
            curveTo(15.667f, 9.504f, 16.004f, 9.167f, 16.004f, 8.752f)
            curveTo(16.004f, 8.337f, 15.667f, 8f, 15.252f, 8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ImageOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ImageOff, contentDescription = null)
    }
}
