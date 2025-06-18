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

public val FluentUi.Filled.ArrowStepInRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowStepInRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.706f, 16.234f)
            curveTo(8.421f, 16.535f, 8.433f, 17.01f, 8.734f, 17.295f)
            curveTo(9.035f, 17.579f, 9.51f, 17.566f, 9.794f, 17.266f)
            lineTo(14.295f, 12.516f)
            curveTo(14.568f, 12.226f, 14.568f, 11.774f, 14.295f, 11.484f)
            lineTo(9.794f, 6.734f)
            curveTo(9.51f, 6.433f, 9.035f, 6.421f, 8.734f, 6.706f)
            curveTo(8.433f, 6.99f, 8.421f, 7.465f, 8.706f, 7.766f)
            lineTo(12.006f, 11.25f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 11.25f, 2f, 11.586f, 2f, 12f)
            curveTo(2f, 12.414f, 2.336f, 12.75f, 2.75f, 12.75f)
            horizontalLineTo(12.006f)
            lineTo(8.706f, 16.234f)
            close()
            moveTo(22f, 12f)
            curveTo(22f, 10.343f, 20.657f, 9f, 19f, 9f)
            curveTo(17.343f, 9f, 16f, 10.343f, 16f, 12f)
            curveTo(16f, 13.657f, 17.343f, 15f, 19f, 15f)
            curveTo(20.657f, 15f, 22f, 13.657f, 22f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowStepInRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowStepInRight, contentDescription = null)
    }
}
