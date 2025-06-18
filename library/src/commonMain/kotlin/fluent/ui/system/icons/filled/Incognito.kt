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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.Incognito: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Incognito",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.123f, 4.612f)
            lineTo(20.23f, 9.246f)
            curveTo(20.643f, 9.329f, 21.045f, 9.42f, 21.434f, 9.519f)
            curveTo(21.836f, 9.62f, 22.079f, 10.028f, 21.977f, 10.43f)
            curveTo(21.876f, 10.831f, 21.468f, 11.075f, 21.066f, 10.973f)
            curveTo(20.591f, 10.853f, 20.09f, 10.743f, 19.568f, 10.645f)
            curveTo(15.014f, 9.785f, 8.988f, 9.785f, 4.435f, 10.644f)
            curveTo(3.912f, 10.743f, 3.41f, 10.853f, 2.934f, 10.973f)
            curveTo(2.533f, 11.075f, 2.125f, 10.831f, 2.023f, 10.43f)
            curveTo(1.922f, 10.028f, 2.165f, 9.62f, 2.566f, 9.519f)
            curveTo(2.956f, 9.42f, 3.359f, 9.329f, 3.773f, 9.245f)
            lineTo(5.879f, 4.612f)
            curveTo(6.325f, 3.63f, 7.304f, 3f, 8.382f, 3f)
            horizontalLineTo(15.619f)
            curveTo(16.698f, 3f, 17.676f, 3.63f, 18.123f, 4.612f)
            close()
            moveTo(3.5f, 16.5f)
            curveTo(3.5f, 14.843f, 4.843f, 13.5f, 6.5f, 13.5f)
            curveTo(8.157f, 13.5f, 9.5f, 14.843f, 9.5f, 16.5f)
            curveTo(9.5f, 18.157f, 8.157f, 19.5f, 6.5f, 19.5f)
            curveTo(4.843f, 19.5f, 3.5f, 18.157f, 3.5f, 16.5f)
            close()
            moveTo(6.5f, 12f)
            curveTo(4.015f, 12f, 2f, 14.015f, 2f, 16.5f)
            curveTo(2f, 18.985f, 4.015f, 21f, 6.5f, 21f)
            curveTo(8.642f, 21f, 10.434f, 19.504f, 10.889f, 17.5f)
            horizontalLineTo(13.111f)
            curveTo(13.566f, 19.504f, 15.358f, 21f, 17.5f, 21f)
            curveTo(19.985f, 21f, 22f, 18.985f, 22f, 16.5f)
            curveTo(22f, 14.015f, 19.985f, 12f, 17.5f, 12f)
            curveTo(15.184f, 12f, 13.276f, 13.75f, 13.028f, 16f)
            horizontalLineTo(10.972f)
            curveTo(10.724f, 13.75f, 8.816f, 12f, 6.5f, 12f)
            close()
            moveTo(14.5f, 16.5f)
            curveTo(14.5f, 14.843f, 15.843f, 13.5f, 17.5f, 13.5f)
            curveTo(19.157f, 13.5f, 20.5f, 14.843f, 20.5f, 16.5f)
            curveTo(20.5f, 18.157f, 19.157f, 19.5f, 17.5f, 19.5f)
            curveTo(15.843f, 19.5f, 14.5f, 18.157f, 14.5f, 16.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun IncognitoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Incognito, contentDescription = null)
    }
}
