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

public val FluentUi.Filled.People: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.People",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8f, 12f)
            curveTo(10.209f, 12f, 12f, 10.209f, 12f, 8f)
            curveTo(12f, 5.791f, 10.209f, 4f, 8f, 4f)
            curveTo(5.791f, 4f, 4f, 5.791f, 4f, 8f)
            curveTo(4f, 10.209f, 5.791f, 12f, 8f, 12f)
            close()
            moveTo(17f, 12f)
            curveTo(18.657f, 12f, 20f, 10.657f, 20f, 9f)
            curveTo(20f, 7.343f, 18.657f, 6f, 17f, 6f)
            curveTo(15.343f, 6f, 14f, 7.343f, 14f, 9f)
            curveTo(14f, 10.657f, 15.343f, 12f, 17f, 12f)
            close()
            moveTo(4.25f, 14f)
            curveTo(3.007f, 14f, 2f, 15.007f, 2f, 16.25f)
            verticalLineTo(16.5f)
            curveTo(2f, 16.5f, 2f, 21f, 8f, 21f)
            curveTo(14f, 21f, 14f, 16.5f, 14f, 16.5f)
            verticalLineTo(16.25f)
            curveTo(14f, 15.007f, 12.993f, 14f, 11.75f, 14f)
            horizontalLineTo(4.25f)
            close()
            moveTo(17f, 19.5f)
            curveTo(15.829f, 19.5f, 14.932f, 19.319f, 14.245f, 19.042f)
            curveTo(14.587f, 18.467f, 14.772f, 17.914f, 14.872f, 17.484f)
            curveTo(14.933f, 17.225f, 14.965f, 17.003f, 14.981f, 16.835f)
            curveTo(14.99f, 16.751f, 14.994f, 16.68f, 14.997f, 16.624f)
            curveTo(14.998f, 16.596f, 14.999f, 16.571f, 15f, 16.55f)
            lineTo(15f, 16.522f)
            lineTo(15f, 16.51f)
            lineTo(15f, 16.505f)
            lineTo(15f, 16.502f)
            curveTo(15f, 16.499f, 15f, 16.5f, 15f, 16.5f)
            verticalLineTo(16.25f)
            curveTo(15f, 15.378f, 14.657f, 14.586f, 14.098f, 14.002f)
            curveTo(14.132f, 14.001f, 14.166f, 14f, 14.2f, 14f)
            horizontalLineTo(19.8f)
            curveTo(21.015f, 14f, 22f, 14.985f, 22f, 16.2f)
            curveTo(22f, 16.2f, 22f, 19.5f, 17f, 19.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeoplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.People, contentDescription = null)
    }
}
