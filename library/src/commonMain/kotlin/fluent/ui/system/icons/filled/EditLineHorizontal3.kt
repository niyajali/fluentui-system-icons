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

public val FluentUi.Filled.EditLineHorizontal3: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EditLineHorizontal3",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.952f, 3.048f)
            curveTo(19.554f, 1.651f, 17.288f, 1.651f, 15.891f, 3.048f)
            lineTo(15f, 3.94f)
            lineTo(20.06f, 9.001f)
            lineTo(20.952f, 8.109f)
            curveTo(22.349f, 6.711f, 22.349f, 4.445f, 20.952f, 3.048f)
            close()
            moveTo(3.941f, 15f)
            lineTo(13.939f, 5.001f)
            lineTo(19f, 10.061f)
            lineTo(9.002f, 20.06f)
            curveTo(8.595f, 20.467f, 8.084f, 20.752f, 7.525f, 20.885f)
            lineTo(2.924f, 21.981f)
            curveTo(2.67f, 22.041f, 2.404f, 21.966f, 2.22f, 21.782f)
            curveTo(2.036f, 21.598f, 1.96f, 21.331f, 2.02f, 21.078f)
            lineTo(3.116f, 16.476f)
            curveTo(3.249f, 15.917f, 3.535f, 15.406f, 3.941f, 15f)
            close()
            moveTo(2.75f, 3f)
            horizontalLineTo(14.525f)
            lineTo(13.025f, 4.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 4.5f, 2f, 4.164f, 2f, 3.75f)
            curveTo(2f, 3.336f, 2.336f, 3f, 2.75f, 3f)
            close()
            moveTo(2.75f, 7f)
            horizontalLineTo(10.526f)
            lineTo(9.026f, 8.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 8.5f, 2f, 8.164f, 2f, 7.75f)
            curveTo(2f, 7.336f, 2.336f, 7f, 2.75f, 7f)
            close()
            moveTo(2.75f, 11f)
            horizontalLineTo(6.526f)
            lineTo(5.026f, 12.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 12.5f, 2f, 12.164f, 2f, 11.75f)
            curveTo(2f, 11.336f, 2.336f, 11f, 2.75f, 11f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EditLineHorizontal3Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.EditLineHorizontal3, contentDescription = null)
    }
}
