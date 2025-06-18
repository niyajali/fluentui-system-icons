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

public val FluentIcons.Regular.AppStore: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AppStore",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            close()
            moveTo(17.75f, 4.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
            close()
            moveTo(9.369f, 15.254f)
            lineTo(8.859f, 16.126f)
            curveTo(8.65f, 16.484f, 8.191f, 16.605f, 7.833f, 16.396f)
            curveTo(7.506f, 16.204f, 7.377f, 15.802f, 7.519f, 15.461f)
            lineTo(7.564f, 15.37f)
            lineTo(7.631f, 15.254f)
            horizontalLineTo(9.369f)
            close()
            moveTo(13.293f, 10.024f)
            lineTo(15.012f, 13.004f)
            lineTo(16.752f, 13.005f)
            curveTo(17.132f, 13.005f, 17.445f, 13.287f, 17.495f, 13.653f)
            lineTo(17.502f, 13.755f)
            curveTo(17.502f, 14.135f, 17.22f, 14.448f, 16.854f, 14.498f)
            lineTo(16.752f, 14.505f)
            lineTo(15.877f, 14.504f)
            lineTo(16.379f, 15.374f)
            curveTo(16.586f, 15.733f, 16.463f, 16.192f, 16.104f, 16.399f)
            curveTo(15.775f, 16.588f, 15.362f, 16.501f, 15.136f, 16.208f)
            lineTo(15.08f, 16.124f)
            lineTo(12.422f, 11.516f)
            lineTo(13.293f, 10.024f)
            close()
            moveTo(13.263f, 7.101f)
            curveTo(13.591f, 7.293f, 13.72f, 7.695f, 13.578f, 8.036f)
            lineTo(13.532f, 8.127f)
            lineTo(10.683f, 13.004f)
            lineTo(12.414f, 13.005f)
            lineTo(13.279f, 14.505f)
            lineTo(7.252f, 14.505f)
            curveTo(6.837f, 14.505f, 6.502f, 14.169f, 6.502f, 13.755f)
            curveTo(6.502f, 13.375f, 6.784f, 13.061f, 7.15f, 13.012f)
            lineTo(7.252f, 13.005f)
            lineTo(8.946f, 13.005f)
            lineTo(11.127f, 9.271f)
            lineTo(10.464f, 8.124f)
            curveTo(10.274f, 7.795f, 10.362f, 7.382f, 10.654f, 7.156f)
            lineTo(10.739f, 7.099f)
            curveTo(11.068f, 6.91f, 11.481f, 6.997f, 11.707f, 7.29f)
            lineTo(11.763f, 7.374f)
            lineTo(11.997f, 7.78f)
            lineTo(12.237f, 7.371f)
            curveTo(12.446f, 7.013f, 12.906f, 6.893f, 13.263f, 7.101f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AppStorePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.AppStore, contentDescription = null)
    }
}
