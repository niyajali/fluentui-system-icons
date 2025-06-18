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

public val FluentUi.Regular.ArrowStepOut: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowStepOut",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.75f, 13.75f)
            curveTo(12.75f, 14.164f, 12.414f, 14.5f, 12f, 14.5f)
            curveTo(11.586f, 14.5f, 11.25f, 14.164f, 11.25f, 13.75f)
            verticalLineTo(4.494f)
            lineTo(7.766f, 7.794f)
            curveTo(7.465f, 8.079f, 6.99f, 8.067f, 6.706f, 7.766f)
            curveTo(6.421f, 7.465f, 6.433f, 6.99f, 6.734f, 6.706f)
            lineTo(11.484f, 2.206f)
            curveTo(11.774f, 1.931f, 12.226f, 1.931f, 12.516f, 2.206f)
            lineTo(17.266f, 6.706f)
            curveTo(17.566f, 6.99f, 17.579f, 7.465f, 17.295f, 7.766f)
            curveTo(17.01f, 8.067f, 16.535f, 8.079f, 16.234f, 7.794f)
            lineTo(12.75f, 4.494f)
            verticalLineTo(13.75f)
            close()
            moveTo(15f, 19f)
            curveTo(15f, 20.657f, 13.657f, 22f, 12f, 22f)
            curveTo(10.343f, 22f, 9f, 20.657f, 9f, 19f)
            curveTo(9f, 17.343f, 10.343f, 16f, 12f, 16f)
            curveTo(13.657f, 16f, 15f, 17.343f, 15f, 19f)
            close()
            moveTo(10.5f, 19f)
            curveTo(10.5f, 19.828f, 11.172f, 20.5f, 12f, 20.5f)
            curveTo(12.828f, 20.5f, 13.5f, 19.828f, 13.5f, 19f)
            curveTo(13.5f, 18.172f, 12.828f, 17.5f, 12f, 17.5f)
            curveTo(11.172f, 17.5f, 10.5f, 18.172f, 10.5f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowStepOutPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowStepOut, contentDescription = null)
    }
}
