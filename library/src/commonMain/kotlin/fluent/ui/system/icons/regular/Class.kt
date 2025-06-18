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

public val FluentIcons.Regular.Class: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Class",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.25f, 2.001f)
            curveTo(18.769f, 2.001f, 20f, 3.232f, 20f, 4.751f)
            verticalLineTo(19.249f)
            curveTo(20f, 20.767f, 18.769f, 21.999f, 17.25f, 21.999f)
            horizontalLineTo(6.75f)
            curveTo(5.231f, 21.999f, 4f, 20.767f, 4f, 19.249f)
            verticalLineTo(4.751f)
            curveTo(4f, 3.492f, 4.846f, 2.43f, 6f, 2.104f)
            lineTo(6f, 3.751f)
            curveTo(5.696f, 3.979f, 5.5f, 4.342f, 5.5f, 4.751f)
            verticalLineTo(19.249f)
            curveTo(5.5f, 19.939f, 6.06f, 20.499f, 6.75f, 20.499f)
            horizontalLineTo(17.25f)
            curveTo(17.941f, 20.499f, 18.5f, 19.939f, 18.5f, 19.249f)
            verticalLineTo(4.751f)
            curveTo(18.5f, 4.06f, 17.941f, 3.501f, 17.25f, 3.501f)
            lineTo(15f, 3.5f)
            verticalLineTo(2f)
            lineTo(17.25f, 2.001f)
            close()
            moveTo(14f, 2f)
            verticalLineTo(10.139f)
            curveTo(14f, 10.886f, 13.201f, 11.167f, 12.711f, 10.903f)
            lineTo(12.628f, 10.851f)
            lineTo(10.502f, 9.566f)
            lineTo(8.424f, 10.817f)
            curveTo(7.924f, 11.178f, 7.093f, 10.956f, 7.007f, 10.259f)
            lineTo(7f, 10.139f)
            verticalLineTo(2f)
            horizontalLineTo(14f)
            close()
            moveTo(12.5f, 3.5f)
            horizontalLineTo(8.5f)
            verticalLineTo(9.023f)
            lineTo(10.073f, 8.074f)
            curveTo(10.338f, 7.936f, 10.657f, 7.933f, 10.891f, 8.05f)
            lineTo(12.5f, 9.024f)
            verticalLineTo(3.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClassPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Class, contentDescription = null)
    }
}
