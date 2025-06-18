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

public val FluentUi.Filled.StreetSign: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StreetSign",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8f, 4.5f)
            curveTo(8f, 3.119f, 9.119f, 2f, 10.5f, 2f)
            curveTo(11.881f, 2f, 13f, 3.119f, 13f, 4.5f)
            verticalLineTo(6f)
            horizontalLineTo(16.379f)
            curveTo(16.975f, 6f, 17.548f, 6.237f, 17.97f, 6.659f)
            lineTo(20.78f, 9.47f)
            curveTo(21.073f, 9.763f, 21.073f, 10.237f, 20.78f, 10.53f)
            lineTo(17.97f, 13.341f)
            curveTo(17.548f, 13.763f, 16.975f, 14f, 16.379f, 14f)
            horizontalLineTo(13f)
            verticalLineTo(20.75f)
            curveTo(13f, 21.44f, 12.44f, 22f, 11.75f, 22f)
            horizontalLineTo(9.25f)
            curveTo(8.56f, 22f, 8f, 21.44f, 8f, 20.75f)
            verticalLineTo(14f)
            horizontalLineTo(5.25f)
            curveTo(4.007f, 14f, 3f, 12.993f, 3f, 11.75f)
            verticalLineTo(8.25f)
            curveTo(3f, 7.007f, 4.007f, 6f, 5.25f, 6f)
            horizontalLineTo(8f)
            verticalLineTo(4.5f)
            close()
            moveTo(11.5f, 4.5f)
            curveTo(11.5f, 3.948f, 11.052f, 3.5f, 10.5f, 3.5f)
            curveTo(9.948f, 3.5f, 9.5f, 3.948f, 9.5f, 4.5f)
            verticalLineTo(6f)
            horizontalLineTo(11.5f)
            verticalLineTo(4.5f)
            close()
            moveTo(9.5f, 20.5f)
            horizontalLineTo(11.5f)
            verticalLineTo(14f)
            horizontalLineTo(9.5f)
            verticalLineTo(20.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StreetSignPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.StreetSign, contentDescription = null)
    }
}
