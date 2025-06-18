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

public val FluentUi.Regular.ProductionCheckmark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ProductionCheckmark",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3.5f)
            curveTo(5.284f, 3.5f, 4.5f, 4.284f, 4.5f, 5.25f)
            verticalLineTo(7.75f)
            curveTo(4.5f, 8.717f, 5.284f, 9.5f, 6.25f, 9.5f)
            horizontalLineTo(8.75f)
            curveTo(9.717f, 9.5f, 10.5f, 8.717f, 10.5f, 7.75f)
            verticalLineTo(5.25f)
            curveTo(10.5f, 4.284f, 9.717f, 3.5f, 8.75f, 3.5f)
            horizontalLineTo(6.25f)
            close()
            moveTo(13.5f, 5.25f)
            curveTo(13.5f, 4.284f, 14.283f, 3.5f, 15.25f, 3.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 3.5f, 19.5f, 4.284f, 19.5f, 5.25f)
            verticalLineTo(7.75f)
            curveTo(19.5f, 8.717f, 18.716f, 9.5f, 17.75f, 9.5f)
            horizontalLineTo(15.25f)
            curveTo(14.283f, 9.5f, 13.5f, 8.717f, 13.5f, 7.75f)
            verticalLineTo(5.25f)
            close()
            moveTo(15.25f, 5f)
            curveTo(15.112f, 5f, 15f, 5.112f, 15f, 5.25f)
            verticalLineTo(7.75f)
            curveTo(15f, 7.888f, 15.112f, 8f, 15.25f, 8f)
            horizontalLineTo(17.75f)
            curveTo(17.888f, 8f, 18f, 7.888f, 18f, 7.75f)
            verticalLineTo(5.25f)
            curveTo(18f, 5.112f, 17.888f, 5f, 17.75f, 5f)
            horizontalLineTo(15.25f)
            close()
            moveTo(7f, 17.5f)
            curveTo(7.828f, 17.5f, 8.5f, 16.828f, 8.5f, 16f)
            curveTo(8.5f, 15.172f, 7.828f, 14.5f, 7f, 14.5f)
            curveTo(6.172f, 14.5f, 5.5f, 15.172f, 5.5f, 16f)
            curveTo(5.5f, 16.828f, 6.172f, 17.5f, 7f, 17.5f)
            close()
            moveTo(6.5f, 13f)
            horizontalLineTo(12.81f)
            curveTo(13.423f, 12.361f, 14.166f, 11.847f, 14.996f, 11.5f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 11.5f, 2f, 13.515f, 2f, 16f)
            curveTo(2f, 18.485f, 4.015f, 20.5f, 6.5f, 20.5f)
            horizontalLineTo(11.732f)
            curveTo(11.488f, 20.031f, 11.299f, 19.528f, 11.174f, 19f)
            horizontalLineTo(6.5f)
            curveTo(4.843f, 19f, 3.5f, 17.657f, 3.5f, 16f)
            curveTo(3.5f, 14.343f, 4.843f, 13f, 6.5f, 13f)
            close()
            moveTo(10.5f, 16f)
            curveTo(10.5f, 16.449f, 10.698f, 16.853f, 11.01f, 17.127f)
            curveTo(11.063f, 16.194f, 11.313f, 15.314f, 11.719f, 14.526f)
            curveTo(11.025f, 14.658f, 10.5f, 15.268f, 10.5f, 16f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(20.854f, 15.146f)
            curveTo(20.658f, 14.951f, 20.342f, 14.951f, 20.146f, 15.146f)
            lineTo(16.5f, 18.793f)
            lineTo(14.854f, 17.146f)
            curveTo(14.658f, 16.951f, 14.342f, 16.951f, 14.146f, 17.146f)
            curveTo(13.951f, 17.342f, 13.951f, 17.658f, 14.146f, 17.854f)
            lineTo(16.146f, 19.854f)
            curveTo(16.342f, 20.049f, 16.658f, 20.049f, 16.854f, 19.854f)
            lineTo(20.854f, 15.854f)
            curveTo(21.049f, 15.658f, 21.049f, 15.342f, 20.854f, 15.146f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ProductionCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ProductionCheckmark, contentDescription = null)
    }
}
