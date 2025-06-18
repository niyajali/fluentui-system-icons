/**
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
package fluent.ui.system.icons.light

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Light.PeopleSettings: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.PeopleSettings",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.5f, 4f)
            curveTo(7.462f, 4f, 5f, 6.462f, 5f, 9.5f)
            curveTo(5f, 12.538f, 7.462f, 15f, 10.5f, 15f)
            curveTo(13.538f, 15f, 16f, 12.538f, 16f, 9.5f)
            curveTo(16f, 6.462f, 13.538f, 4f, 10.5f, 4f)
            close()
            moveTo(6f, 9.5f)
            curveTo(6f, 7.015f, 8.015f, 5f, 10.5f, 5f)
            curveTo(12.985f, 5f, 15f, 7.015f, 15f, 9.5f)
            curveTo(15f, 11.985f, 12.985f, 14f, 10.5f, 14f)
            curveTo(8.015f, 14f, 6f, 11.985f, 6f, 9.5f)
            close()
            moveTo(23f, 7f)
            curveTo(20.791f, 7f, 19f, 8.791f, 19f, 11f)
            curveTo(19f, 13.209f, 20.791f, 15f, 23f, 15f)
            curveTo(25.209f, 15f, 27f, 13.209f, 27f, 11f)
            curveTo(27f, 8.791f, 25.209f, 7f, 23f, 7f)
            close()
            moveTo(20f, 11f)
            curveTo(20f, 9.343f, 21.343f, 8f, 23f, 8f)
            curveTo(24.657f, 8f, 26f, 9.343f, 26f, 11f)
            curveTo(26f, 12.657f, 24.657f, 14f, 23f, 14f)
            curveTo(21.343f, 14f, 20f, 12.657f, 20f, 11f)
            close()
            moveTo(16f, 17f)
            curveTo(16.387f, 17f, 16.757f, 17.073f, 17.096f, 17.207f)
            curveTo(16.806f, 17.46f, 16.531f, 17.731f, 16.275f, 18.019f)
            curveTo(16.185f, 18.006f, 16.093f, 18f, 16f, 18f)
            horizontalLineTo(5f)
            curveTo(3.895f, 18f, 3f, 18.895f, 3f, 20f)
            curveTo(3f, 20.884f, 3.333f, 22.12f, 4.406f, 23.137f)
            curveTo(5.476f, 24.151f, 7.339f, 25f, 10.5f, 25f)
            curveTo(11.918f, 25f, 13.075f, 24.829f, 14.017f, 24.549f)
            curveTo(14.037f, 24.89f, 14.076f, 25.226f, 14.134f, 25.556f)
            curveTo(13.121f, 25.837f, 11.919f, 26f, 10.5f, 26f)
            curveTo(7.161f, 26f, 5.024f, 25.099f, 3.719f, 23.863f)
            curveTo(2.417f, 22.63f, 2f, 21.116f, 2f, 20f)
            curveTo(2f, 18.343f, 3.343f, 17f, 5f, 17f)
            horizontalLineTo(16f)
            close()
            moveTo(18.343f, 20.036f)
            curveTo(18.603f, 20.88f, 18.089f, 21.766f, 17.226f, 21.964f)
            lineTo(15.69f, 22.315f)
            curveTo(15.566f, 22.856f, 15.5f, 23.42f, 15.5f, 24f)
            curveTo(15.5f, 24.515f, 15.552f, 25.017f, 15.651f, 25.503f)
            lineTo(17.348f, 25.927f)
            curveTo(18.185f, 26.136f, 18.681f, 26.993f, 18.444f, 27.819f)
            lineTo(17.948f, 29.543f)
            curveTo(18.731f, 30.257f, 19.665f, 30.807f, 20.698f, 31.14f)
            lineTo(21.958f, 29.84f)
            curveTo(22.557f, 29.222f, 23.551f, 29.222f, 24.151f, 29.839f)
            lineTo(25.387f, 31.112f)
            curveTo(26.417f, 30.766f, 27.348f, 30.203f, 28.124f, 29.477f)
            lineTo(27.657f, 27.963f)
            curveTo(27.397f, 27.12f, 27.911f, 26.233f, 28.774f, 26.036f)
            lineTo(30.31f, 25.685f)
            curveTo(30.434f, 25.143f, 30.5f, 24.579f, 30.5f, 24f)
            curveTo(30.5f, 23.485f, 30.448f, 22.982f, 30.349f, 22.496f)
            lineTo(28.652f, 22.073f)
            curveTo(27.815f, 21.864f, 27.319f, 21.006f, 27.556f, 20.18f)
            lineTo(28.052f, 18.456f)
            curveTo(27.269f, 17.743f, 26.335f, 17.192f, 25.302f, 16.86f)
            lineTo(24.042f, 18.159f)
            curveTo(23.443f, 18.777f, 22.449f, 18.778f, 21.849f, 18.16f)
            lineTo(20.613f, 16.888f)
            curveTo(19.583f, 17.233f, 18.652f, 17.797f, 17.876f, 18.523f)
            lineTo(18.343f, 20.036f)
            close()
            moveTo(25f, 24f)
            curveTo(25f, 25.104f, 24.105f, 26f, 23f, 26f)
            curveTo(21.895f, 26f, 21f, 25.104f, 21f, 24f)
            curveTo(21f, 22.895f, 21.895f, 22f, 23f, 22f)
            curveTo(24.105f, 22f, 25f, 22.895f, 25f, 24f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.PeopleSettings, contentDescription = null)
    }
}
