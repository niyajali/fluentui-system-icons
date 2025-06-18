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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.ImageShadow: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageShadow",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.25f, 2f)
            curveTo(3.455f, 2f, 2f, 3.455f, 2f, 5.25f)
            verticalLineTo(14.25f)
            curveTo(2f, 14.891f, 2.186f, 15.489f, 2.506f, 15.993f)
            lineTo(8.207f, 10.623f)
            curveTo(9.074f, 9.807f, 10.426f, 9.807f, 11.293f, 10.623f)
            lineTo(16.994f, 15.993f)
            curveTo(17.314f, 15.489f, 17.5f, 14.891f, 17.5f, 14.25f)
            verticalLineTo(5.25f)
            curveTo(17.5f, 3.455f, 16.045f, 2f, 14.25f, 2f)
            horizontalLineTo(5.25f)
            close()
            moveTo(12.75f, 8f)
            curveTo(12.06f, 8f, 11.5f, 7.44f, 11.5f, 6.75f)
            curveTo(11.5f, 6.06f, 12.06f, 5.5f, 12.75f, 5.5f)
            curveTo(13.44f, 5.5f, 14f, 6.06f, 14f, 6.75f)
            curveTo(14f, 7.44f, 13.44f, 8f, 12.75f, 8f)
            close()
            moveTo(5.25f, 17.5f)
            curveTo(4.64f, 17.5f, 4.07f, 17.332f, 3.582f, 17.04f)
            lineTo(9.236f, 11.715f)
            curveTo(9.525f, 11.443f, 9.975f, 11.443f, 10.264f, 11.715f)
            lineTo(15.918f, 17.04f)
            curveTo(15.43f, 17.332f, 14.86f, 17.5f, 14.25f, 17.5f)
            horizontalLineTo(5.25f)
            close()
            moveTo(6.499f, 18.75f)
            verticalLineTo(18.5f)
            horizontalLineTo(14.5f)
            curveTo(14.58f, 18.5f, 14.659f, 18.498f, 14.738f, 18.493f)
            curveTo(16.837f, 18.37f, 18.501f, 16.629f, 18.501f, 14.5f)
            verticalLineTo(6.5f)
            horizontalLineTo(18.749f)
            curveTo(20.544f, 6.5f, 21.999f, 7.955f, 21.999f, 9.75f)
            verticalLineTo(16.75f)
            curveTo(21.999f, 19.649f, 19.649f, 22f, 16.749f, 22f)
            horizontalLineTo(9.749f)
            curveTo(7.954f, 22f, 6.499f, 20.545f, 6.499f, 18.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ImageShadowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ImageShadow, contentDescription = null)
    }
}
