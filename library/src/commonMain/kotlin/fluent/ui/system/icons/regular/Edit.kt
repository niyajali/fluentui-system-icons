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

public val FluentIcons.Regular.Edit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Edit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.952f, 3.048f)
            curveTo(19.554f, 1.651f, 17.288f, 1.651f, 15.891f, 3.048f)
            lineTo(3.941f, 15f)
            curveTo(3.535f, 15.406f, 3.249f, 15.917f, 3.116f, 16.476f)
            lineTo(2.02f, 21.078f)
            curveTo(1.96f, 21.331f, 2.036f, 21.598f, 2.22f, 21.782f)
            curveTo(2.404f, 21.966f, 2.67f, 22.041f, 2.924f, 21.981f)
            lineTo(7.525f, 20.885f)
            curveTo(8.084f, 20.752f, 8.595f, 20.467f, 9.002f, 20.06f)
            lineTo(20.952f, 8.109f)
            curveTo(22.349f, 6.711f, 22.349f, 4.445f, 20.952f, 3.048f)
            close()
            moveTo(16.952f, 4.109f)
            curveTo(17.763f, 3.297f, 19.08f, 3.297f, 19.891f, 4.109f)
            curveTo(20.703f, 4.92f, 20.703f, 6.236f, 19.891f, 7.048f)
            lineTo(19f, 7.939f)
            lineTo(16.061f, 5f)
            lineTo(16.952f, 4.109f)
            close()
            moveTo(15f, 6.061f)
            lineTo(17.939f, 9f)
            lineTo(7.941f, 19f)
            curveTo(7.731f, 19.21f, 7.467f, 19.357f, 7.178f, 19.426f)
            lineTo(3.762f, 20.24f)
            lineTo(4.575f, 16.824f)
            curveTo(4.644f, 16.535f, 4.792f, 16.27f, 5.002f, 16.06f)
            lineTo(15f, 6.061f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Edit, contentDescription = null)
    }
}
