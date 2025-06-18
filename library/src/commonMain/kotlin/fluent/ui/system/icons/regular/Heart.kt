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

public val FluentIcons.Regular.Heart: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Heart",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.82f, 5.579f)
            lineTo(11.999f, 6.402f)
            lineTo(11.176f, 5.578f)
            curveTo(9.077f, 3.479f, 5.674f, 3.479f, 3.575f, 5.578f)
            curveTo(1.475f, 7.677f, 1.475f, 11.081f, 3.575f, 13.18f)
            lineTo(11.47f, 21.075f)
            curveTo(11.763f, 21.368f, 12.238f, 21.368f, 12.531f, 21.075f)
            lineTo(20.432f, 13.178f)
            curveTo(22.526f, 11.072f, 22.53f, 7.679f, 20.431f, 5.579f)
            curveTo(18.328f, 3.476f, 14.923f, 3.476f, 12.82f, 5.579f)
            close()
            moveTo(19.368f, 12.121f)
            lineTo(12f, 19.484f)
            lineTo(4.635f, 12.119f)
            curveTo(3.122f, 10.606f, 3.122f, 8.152f, 4.635f, 6.639f)
            curveTo(6.148f, 5.126f, 8.602f, 5.126f, 10.115f, 6.639f)
            lineTo(11.473f, 7.996f)
            curveTo(11.771f, 8.294f, 12.255f, 8.289f, 12.546f, 7.984f)
            lineTo(13.881f, 6.64f)
            curveTo(15.398f, 5.123f, 17.853f, 5.123f, 19.37f, 6.64f)
            curveTo(20.884f, 8.153f, 20.881f, 10.6f, 19.368f, 12.121f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HeartPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Heart, contentDescription = null)
    }
}
